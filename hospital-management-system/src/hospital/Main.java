package hospital;

import hospital.exceptions.DoctorNotFoundException;
import hospital.exceptions.InvalidInputException;
import hospital.exceptions.PatientNotFoundException;
import hospital.exceptions.SlotNotAvailableException;
import hospital.model.Department;
import hospital.model.Doctor;
import hospital.model.Gender;
import hospital.model.Patient;
import hospital.service.Appointment;
import hospital.service.HospitalService;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final HospitalService service = new HospitalService();

    public static void main(String[] args) {
        seedDemoData();

        boolean running = true;
        while (running) {
            printMenu();
            String choice = sc.nextLine().trim();

            try {
                switch (choice) {
                    case "1":
                        addPatient();
                        break;
                    case "2":
                        addDoctor();
                        break;
                    case "3":
                        viewPatients();
                        break;
                    case "4":
                        viewDoctors();
                        break;
                    case "5":
                        bookAppointment();
                        break;
                    case "6":
                        viewAppointments();
                        break;
                    case "7":
                        generateBill();
                        break;
                    case "8":
                        removePatient();
                        break;
                    case "9":
                        removeDoctor();
                        break;
                    case "10":
                        service.demonstrateCasting();
                        break;
                    case "0":
                        running = false;
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please choose a number from the menu.");
                }
            } catch (InvalidInputException | PatientNotFoundException
                     | DoctorNotFoundException | SlotNotAvailableException e) {
                // Custom checked exceptions caught here
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                // Safety net for anything unexpected
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }

        sc.close();
    }

    private static void printMenu() {
        System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");
        System.out.println("1.  Add Patient");
        System.out.println("2.  Add Doctor");
        System.out.println("3.  View All Patients");
        System.out.println("4.  View All Doctors");
        System.out.println("5.  Book Appointment");
        System.out.println("6.  View Appointments");
        System.out.println("7.  Generate Bill");
        System.out.println("8.  Remove Patient");
        System.out.println("9.  Remove Doctor");
        System.out.println("10. Demo Upcasting / Downcasting");
        System.out.println("0.  Exit");
        System.out.print("Choose an option: ");
    }

    private static void addPatient() throws InvalidInputException {
        System.out.print("Name: ");
        String name = sc.nextLine().trim();
        int age = readInt("Age: ");
        Gender gender = readGender();
        System.out.print("Phone: ");
        String phone = sc.nextLine().trim();
        System.out.print("Disease / Reason for visit: ");
        String disease = sc.nextLine().trim();

        Patient p = service.addPatient(name, age, gender, phone, disease);
        System.out.println("Patient added successfully! ID: " + p.getPatientId());
    }

    private static void addDoctor() throws InvalidInputException {
        System.out.print("Name: ");
        String name = sc.nextLine().trim();
        int age = readInt("Age: ");
        Gender gender = readGender();
        System.out.print("Phone: ");
        String phone = sc.nextLine().trim();
        Department dept = readDepartment();
        double fee = readDouble("Consultation Fee: ");

        Doctor d = service.addDoctor(name, age, gender, phone, dept, fee);
        System.out.println("Doctor added successfully! ID: " + d.getDoctorId());
    }

    private static void viewPatients() {
        List<Patient> patients = service.getAllPatients();
        if (patients.isEmpty()) {
            System.out.println("No patients registered yet.");
            return;
        }
        System.out.println("\n--- Patient List ---");
        for (Patient p : patients) {
            System.out.println(p.describe() + " | Disease: " + p.getDisease());
        }
    }

    private static void viewDoctors() {
        List<Doctor> doctors = service.getAllDoctors();
        if (doctors.isEmpty()) {
            System.out.println("No doctors registered yet.");
            return;
        }
        System.out.println("\n--- Doctor List ---");
        for (Doctor d : doctors) {
            System.out.println(d.describe() + " | Dept: " + d.getDepartment()
                    + " | Fee: $" + d.getConsultationFee()
                    + " | Slots: " + d.getAvailableSlots());
        }
    }

    private static void bookAppointment()
            throws PatientNotFoundException, DoctorNotFoundException, SlotNotAvailableException {
        System.out.print("Patient ID: ");
        String pid = sc.nextLine().trim();
        System.out.print("Doctor ID: ");
        String did = sc.nextLine().trim();

        Doctor doc = service.findDoctorById(did);
        System.out.println("Available slots: " + doc.getAvailableSlots());
        System.out.print("Choose slot: ");
        String slot = sc.nextLine().trim();

        Appointment appt = service.bookAppointment(pid, did, slot);
        System.out.println("Appointment booked: " + appt);
    }

    private static void viewAppointments() {
        List<Appointment> appts = service.getAllAppointments();
        if (appts.isEmpty()) {
            System.out.println("No appointments booked yet.");
            return;
        }
        System.out.println("\n--- Appointments ---");
        for (Appointment a : appts) {
            System.out.println(a);
        }
    }

    private static void generateBill() throws PatientNotFoundException {
        System.out.print("Patient ID: ");
        String pid = sc.nextLine().trim();

        Patient p = service.findPatientById(pid);
        double bill = service.generateBill(pid);

        System.out.println("--- Bill for " + p.getName() + " (" + pid + ") ---");
        System.out.println("Consultation Charges: $" + p.getConsultationCharges());
        System.out.println("Medicine Charges: $" + p.getMedicineCharges());
        System.out.println("Total: $" + String.format("%.2f", bill));
    }

    private static void removePatient() throws PatientNotFoundException {
        System.out.print("Patient ID to remove: ");
        String pid = sc.nextLine().trim();
        service.removePatient(pid);
        System.out.println("Patient removed.");
    }

    private static void removeDoctor() throws DoctorNotFoundException {
        System.out.print("Doctor ID to remove: ");
        String did = sc.nextLine().trim();
        service.removeDoctor(did);
        System.out.println("Doctor removed.");
    }

    // ---------------- input helpers (try/catch in action) ----------------

    private static int readInt(String prompt) throws InvalidInputException {
        System.out.print(prompt);
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Please enter a valid whole number.");
        }
    }

    private static double readDouble(String prompt) throws InvalidInputException {
        System.out.print(prompt);
        try {
            return Double.parseDouble(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Please enter a valid amount.");
        }
    }

    private static Gender readGender() throws InvalidInputException {
        System.out.print("Gender (M/F/O): ");
        String g = sc.nextLine().trim().toUpperCase();
        switch (g) {
            case "M":
                return Gender.MALE;
            case "F":
                return Gender.FEMALE;
            case "O":
                return Gender.OTHER;
            default:
                throw new InvalidInputException("Invalid gender. Use M, F or O.");
        }
    }

    private static Department readDepartment() throws InvalidInputException {
        System.out.println("Departments: 1.CARDIOLOGY 2.NEUROLOGY 3.ORTHOPEDICS 4.PEDIATRICS 5.GENERAL");
        System.out.print("Choose department (1-5): ");
        String choice = sc.nextLine().trim();
        switch (choice) {
            case "1":
                return Department.CARDIOLOGY;
            case "2":
                return Department.NEUROLOGY;
            case "3":
                return Department.ORTHOPEDICS;
            case "4":
                return Department.PEDIATRICS;
            case "5":
                return Department.GENERAL;
            default:
                throw new InvalidInputException("Invalid department choice.");
        }
    }

    private static void seedDemoData() {
        service.addPatient("Alice Uwase", 29, Gender.FEMALE, "0788111111", "Fever");
        service.addPatient("Jean Mugisha", 45, Gender.MALE, "0788222222", "Back Pain");
        service.addDoctor("Dr. Eric Habimana", 40, Gender.MALE, "0788333333", Department.CARDIOLOGY, 50.0);
        service.addDoctor("Dr. Grace Ingabire", 35, Gender.FEMALE, "0788444444", Department.PEDIATRICS, 40.0);
        service.addStaff("Diane Umutoni", 26, Gender.FEMALE, "0788555555", "Receptionist", 300.0);
        System.out.println("Demo data loaded: 2 patients, 2 doctors, 1 staff member.");
    }
}
