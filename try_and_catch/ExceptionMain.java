package try_and_catch;

public class ExceptionMain {

  public static void main(String[] args) {

    int a = 4;
    int b = 0;

    try {

      if (a == 0) {
        throw new ArithmeticException();
      }

      int res = a / b;

      System.out.println("result" + res);

    } catch (ArithmeticException e) {

      System.out.println(e);

    }

  }
}


// checked and unchecked exception
// runtime exception are unchecked
// checked recorded byt he compiler computer like file not found exception
//Exception is the parent of other exception


//custom exception   our example exception