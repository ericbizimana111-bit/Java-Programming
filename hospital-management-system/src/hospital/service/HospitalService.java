package hospital.service;

import hospital.exceptions.DoctorNotFoundException;
import hospital.exceptions.PatientNotFoundException;
import hospital.exceptions.SlotNotAvailableException;
import hospital.model.Department;
import hospital.model.Doctor;
import hospital.model.Gender;
import hospital.model.Patient;
import hospital.model.Person;
import hospital.model.Staff;

import java.util.ArrayList;
import java.util.List;

/**
 * The "backend" brain of the system: holds all in-memory data and business
 * logic. Main.java (the console UI) only talks to this class.
 */
public class HospitalService {

    private final List<Patient> patients;
    private final List<Doctor> doctors;
    private final List<Staff> staffMembers;
    private final List<Appointment> appointments;

    // Everyone (patients, doctors, staff) stored together as Person
    // references -> this is UPCASTING happening automatically whenever
    // a Patient/Doctor/Staff object is added to this list.
    private final List<Person> allPeople;

    public HospitalService() {
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        staffMembers = new ArrayList<>();
        appointments = new ArrayList<>();
        allPeople = new ArrayList<>();
    }

    // ---------------- Patient management ----------------

    public Patient addPatient(String name, int age, Gender gender, String phone, String disease) {
        Patient p = new Patient(name, age, gender, phone, disease);
        patients.add(p);
        allPeople.add(p); // upcast: Patient -> Person
        return p;
    }

    public Patient findPatientById(String id) throws PatientNotFoundException {
        for (Patient p : patients) {
            if (p.getPatientId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        throw new PatientNotFoundException("Patient with ID " + id + " not found.");
    }

    public void removePatient(String id) throws PatientNotFoundException {
        Patient p = findPatientById(id);
        patients.remove(p);
        allPeople.remove(p);
    }

    public List<Patient> getAllPatients() {
        return patients;
    }

    // ---------------- Doctor management ----------------

    public Doctor addDoctor(String name, int age, Gender gender, String phone,
                             Department dept, double fee) {
        Doctor d = new Doctor(name, age, gender, phone, dept, fee);
        doctors.add(d);
        allPeople.add(d); // upcast: Doctor -> Person
        return d;
    }

    public Doctor findDoctorById(String id) throws DoctorNotFoundException {
        for (Doctor d : doctors) {
            if (d.getDoctorId().equalsIgnoreCase(id)) {
                return d;
            }
        }
        throw new DoctorNotFoundException("Doctor with ID " + id + " not found.");
    }

    public void removeDoctor(String id) throws DoctorNotFoundException {
        Doctor d = findDoctorById(id);
        doctors.remove(d);
        allPeople.remove(d);
    }

    public List<Doctor> getAllDoctors() {
        return doctors;
    }

    // ---------------- Staff management ----------------

    public Staff addStaff(String name, int age, Gender gender, String phone,
                           String designation, double salary) {
        Staff s = new Staff(name, age, gender, phone, designation, salary);
        staffMembers.add(s);
        allPeople.add(s); // upcast: Staff -> Person
        return s;
    }

    public List<Staff> getAllStaff() {
        return staffMembers;
    }

    // ---------------- Appointment management ----------------

    public Appointment bookAppointment(String patientId, String doctorId, String slot)
            throws PatientNotFoundException, DoctorNotFoundException, SlotNotAvailableException {
        Patient patient = findPatientById(patientId);
        Doctor doctor = findDoctorById(doctorId);

        if (!doctor.bookSlot(slot)) {
            throw new SlotNotAvailableException(
                    "Slot " + slot + " is not available for Dr. " + doctor.getName());
        }

        Appointment appt = new Appointment(patient, doctor, slot);
        appointments.add(appt);

        patient.setConsultationCharges(patient.getConsultationCharges() + doctor.getConsultationFee());
        patient.addMedicalHistory("Visited Dr. " + doctor.getName() + " (" + doctor.getDepartment()
                + ") at " + slot);

        return appt;
    }

    public List<Appointment> getAllAppointments() {
        return appointments;
    }

    // ---------------- Billing ----------------

    public double generateBill(String patientId) throws PatientNotFoundException {
        Patient patient = findPatientById(patientId);
        return patient.calculateBill(); // polymorphism via Payable interface
    }

    // ---------------- Upcasting / Downcasting demo ----------------

    public void demonstrateCasting() {
        System.out.println("\n--- Upcasting & Downcasting Demo ---");
        for (Person person : allPeople) {
            // every object in this list is being handled as a Person (upcasting)
            System.out.println("As Person -> " + person.describe());

            if (person instanceof Patient) {
                Patient patient = (Patient) person; // downcasting back to Patient
                System.out.println("   Downcast to Patient -> Disease: " + patient.getDisease()
                        + " | Current Bill: $" + String.format("%.2f", patient.calculateBill()));
            } else if (person instanceof Doctor) {
                Doctor doctor = (Doctor) person; // downcasting back to Doctor
                System.out.println("   Downcast to Doctor -> Department: " + doctor.getDepartment()
                        + " | Free Slots: " + doctor.getAvailableSlots());
            } else if (person instanceof Staff) {
                Staff staff = (Staff) person; // downcasting back to Staff
                System.out.println("   Downcast to Staff -> Designation: " + staff.getDesignation());
            }
        }
    }

    public List<Person> getAllPeople() {
        return allPeople;
    }
}
