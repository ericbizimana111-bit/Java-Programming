package hospital.model;

import hospital.interfaces.Payable;

import java.util.ArrayList;
import java.util.List;

public class Patient extends Person implements Payable {

    private static int patientCount = 0; // static: shared across all patients

    private final String patientId; // final: never changes after creation
    private String disease;
    private double consultationCharges;
    private double medicineCharges;
    private final List<String> medicalHistory;

    public Patient(String name, int age, Gender gender, String phone, String disease) {
        super("P" + String.format("%03d", ++patientCount), name, age, gender, phone);
        this.patientId = this.id;
        this.disease = disease;
        this.medicalHistory = new ArrayList<>();
        this.consultationCharges = 0;
        this.medicineCharges = 0;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public List<String> getMedicalHistory() {
        return medicalHistory;
    }

    public void addMedicalHistory(String record) {
        medicalHistory.add(record);
    }

    public double getConsultationCharges() {
        return consultationCharges;
    }

    public void setConsultationCharges(double consultationCharges) {
        this.consultationCharges = consultationCharges;
    }

    public double getMedicineCharges() {
        return medicineCharges;
    }

    public void setMedicineCharges(double medicineCharges) {
        this.medicineCharges = medicineCharges;
    }

    public static int getPatientCount() {
        return patientCount;
    }

    @Override
    public String getRole() {
        return "Patient";
    }

    @Override
    public double calculateBill() {
        return consultationCharges + medicineCharges;
    }
}
