package interfaces;

public class Iphone implements Callable,Camera{
  
    // this is showing that this method is from the asbstract class which is abstract
   // the @override annotaion is used = to explicitly declare that a method in a subclass is intended to override a method in its superclass.
    @Override 
    public void call(){
         System.out.println("Calling using Iphone networks...");
    }

   @Override
    public void takePhoto(){
         System.out.println("Taking a 108MP high-resolution photo with Iphone.");
    }
    
}
