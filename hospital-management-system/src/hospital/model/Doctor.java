package hospital.model;

import hospital.interfaces.Schedulable;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person implements Schedulable {

    private static int doctorCount = 0;

    private final String doctorId;
    private Department department;
    private double consultationFee;
    private final List<String> availableSlots;

    public Doctor(String name, int age, Gender gender, String phone,
                   Department department, double consultationFee) {
        super("D" + String.format("%03d", ++doctorCount), name, age, gender, phone);
        this.doctorId = this.id;
        this.department = department;
        this.consultationFee = consultationFee;
        this.availableSlots = new ArrayList<>();
        availableSlots.add("09:00 AM");
        availableSlots.add("11:00 AM");
        availableSlots.add("02:00 PM");
        availableSlots.add("04:00 PM");
    }

    public String getDoctorId() {
        return doctorId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    public static int getDoctorCount() {
        return doctorCount;
    }

    @Override
    public String getRole() {
        return "Doctor";
    }

    @Override
    public List<String> getAvailableSlots() {
        return availableSlots;
    }

    @Override
    public boolean bookSlot(String slot) {
        return availableSlots.remove(slot);
    }

    @Override
    public void cancelSlot(String slot) {
        if (!availableSlots.contains(slot)) {
            availableSlots.add(slot);
        }
    }
}
