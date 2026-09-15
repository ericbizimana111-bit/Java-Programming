package interfaces;

// Samsung implements both 
// Unlike abstract classes (where you can only extends one), a Java class can implements multiple interfaces at the same time.
  //@override =  this is showing that this method is from the asbstract class which is abstract

public class Samsung implements Callable, Camera {

    @Override  //because the function call is being got from the Callable.java interface so it is used
    public void call() {
        System.out.println("Calling using Samsung Galaxy network...");
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a 108MP high-resolution photo with Samsung.");
    }
}
