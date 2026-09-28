package hospital.interfaces;

public interface Payable {
    double calculateBill();

    default void printReceipt(String name, double amount) {
        System.out.println("Receipt for " + name + ": $" + String.format("%.2f", amount));
    }
}
