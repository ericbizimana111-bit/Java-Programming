package Oop.Encapsulation;

// ==== Encapasulation balance is data ,  deposit() controlled way to modify the data  ==== //
public class BankAccount {

    private double balance;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public double getBalance() {
        return balance;
    };

}
/* 
            ENCAPSULATION
                 │
       ┌─────────┴─────────┐
       │                   │
   DATA/STATE          METHODS
       │                   │
   private             public
       │                   │
       └─────────┬─────────┘
                 │
          CONTROLLED ACCESS
                 │
        outside code uses
        the public interface */
