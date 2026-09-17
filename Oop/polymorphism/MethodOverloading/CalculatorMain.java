package Oop.polymorphism.MethodOverloading;

public class CalculatorMain {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    System.out.println("Result 1: " + calc.add(10, 10));
    System.out.println("Result 2: " + calc.add(10, 10, 20));
    System.out.println("Result 3: " + calc.add(10.0, 10.9));
  }
}


