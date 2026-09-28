package hospital.service;

import hospital.model.Doctor;
import hospital.model.Patient;

public class Appointment {

    private static int appointmentCount = 0;

    private final String appointmentId;
    private final Patient patient;
    private final Doctor doctor;
    private final String slot;
    private String status;

    public Appointment(Patient patient, Doctor doctor, String slot) {
        this.appointmentId = "A" + String.format("%03d", ++appointmentCount);
        this.patient = patient;
        this.doctor = doctor;
        this.slot = slot;
        this.status = "Scheduled";
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getSlot() {
        return slot;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("[%s] Patient: %s (%s) -> Doctor: %s (%s) | Slot: %s | Status: %s",
                appointmentId, patient.getName(), patient.getPatientId(),
                doctor.getName(), doctor.getDoctorId(), slot, status);
    }
}
