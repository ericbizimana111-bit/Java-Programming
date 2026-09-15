package Oop.abstraction;

public class Samsung extends Phone {

    @Override
    // this is showing that this method is from the asbstract class which is abstract
    public void call() {
        System.out.println("Calling using Samsung Galaxy 11");
    }
}
