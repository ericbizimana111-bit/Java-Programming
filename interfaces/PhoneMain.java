package interfaces;

public class PhoneMain {

    public static void main(String[] args) {

        PhoneService phoneService = new PhoneService();

        // Instantiate using the Interface types to enforce specific behaviors
        // Callable s = new Samsung(); //  this goes with  Callable device in the parameter of the PhoneService method makecall
        // Callable p = new Iphone();  //  this goes with  Callable device in the parameter of the PhoneService method makecall
        // Camera s = new Samsung();
        // Camera p = new Iphone();


        Samsung s = new Samsung();
        Iphone p = new Iphone();

        // === doing this without using the phoneservice === //

        // s.call();
        // p.call();
        // s.takePhoto();
        // p.takePhoto();

        // 1. Test calling capability via the service
        phoneService.makeCall(s); // Upcasting happens here!
        phoneService.takePhoto(s); // Upcasting happens here too!

        //Behind the scenes: You take a specific Samsung s object and pass it into a method that expects a general Callable device.
        //Java automatically upcasts your Samsung type to a Callable type.It is identical to manually doing: Callable device = (Callable) s;

        // 2. Test camera capability directly
        phoneService.takePhoto(s);
        phoneService.takePhoto(p);

    }
}
