package try_and_catch;

import java.util.Scanner;

public class ExceptionMainScanner {
  public static void main(String[] args) {

    //c is a resource so it have to be closed
    Scanner c = new Scanner(System.in);

    double amount;
    double balance = 5000;

    System.out.println("Enter Amount");
    amount = c.nextDouble();

    try {
      if (amount > balance)
        throw new WithdrawException("Insuficient amount");
      System.out.println("success");

    } catch (WithdrawException e) {
      System.out.println(e);

    }finally{
      c.close();
    }

  }
}
