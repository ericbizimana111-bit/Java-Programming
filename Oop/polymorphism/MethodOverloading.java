package Oop.polymorphism;
//Method Overloading = compile-time polymorphism 

//Overloading == means having multiple methods with the same name but different parameters in the same class 

//here the decision is made at the compile time when checking the input and deciding the function to use 

public class MethodOverloading {

  int add(int a, int b) {
    return a + b;
  }

  int add(int a, int b, int c) {
    return a + b + c;
  }

  double add(double a, double b) {
    return a + b;
  }

}

// The compiler looks at the arguments you're passing and decide which 
// add() method should be called.