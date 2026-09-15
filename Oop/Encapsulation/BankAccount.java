package Oop.encapsulation;

// ==== Encapasulation balance is data ,  deposit() controlled way to modify the data  ==== //
public class BankAccount {

    private double balance; // here the data is hidden because it is private
    // so the outside can not do account.balance = 10000
    // private fro protecting the data

    // the controlled way to modify the data
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }

    }

    // the controlled way to read the data
    public double getBalance() {
        return balance;
    }; // this provides the controlled reading of the balance , this allows outside
       // code to read the balance wihout giving it direct access to the variable

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000);
        System.out.println("New Balance is " + bankAccount.getBalance());
    }
}

// Keep an object'sdata protected and provide controlled public methods
// through which other objects can interact with that data.

/*
 * ENCAPSULATION
 * │
 * ┌─────────┴─────────┐
 * │ │
 * DATA/STATE METHODS
 * │ │
 * private public
 * │ │
 * └─────────┬─────────┘
 * │
 * CONTROLLED ACCESS
 * │
 * outside code uses
 * the public interface
 */
