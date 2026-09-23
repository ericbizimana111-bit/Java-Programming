
public class ExceptionMain {

  public static void main(String[] args) {

    int a = 4;
    int b = 0;

    try {

      int res = a / b;

      System.out.println("result" + res);

    } catch (ArithmeticException e) {

      System.out.println("Arithmetic Exception");

    }

  }
}

// checked and unchecked exception
// runtime exception are unchecked
// checked recorded byt he compiler computer like file not found exception