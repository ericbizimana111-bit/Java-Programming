package hospital.model;

public class Staff extends Person {

    private static int staffCount = 0;

    private final String staffId;
    private String designation;
    private double salary;

    public Staff(String name, int age, Gender gender, String phone, String designation, double salary) {
        super("S" + String.format("%03d", ++staffCount), name, age, gender, phone);
        this.staffId = this.id;
        this.designation = designation;
        this.salary = salary;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getRole() {
        return "Staff - " + designation;
    }
}
