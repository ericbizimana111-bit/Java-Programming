package Oop.abstraction;

public class Iphone extends Phone{

    @Override 
    // this is showing that this method is from the asbstract class which is abstract
   // the @override annotaion is used = to explicitly declare that a method in a subclass is intended to override a method in its superclass.
    public void call(){
         System.out.println("Calling using iphone pro 16");
    }
}
