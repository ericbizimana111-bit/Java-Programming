package lamda_expression;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    // usign ineer class
    // lamda expression

    // K k = x -> System.out.println("In display"+x);
    // K k = (x, y) -> System.out.println("In display" + x);
    K k = (x, y) -> x+y 

    int sum = k.display(7, 9);
    System.out.println("sum :" + sum); 

  }
}
