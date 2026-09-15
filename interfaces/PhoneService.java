package interfaces;

//Decoupling  and Flexiblity 
//you Phone service is decoupled and flexible


// ====== Decoupling and Flexibility  =======  //  


public class PhoneService {

    // This method only cares if the object CAN CALL or TAKE PHOTO
    public void makeCall(Callable device) {
        device.call();

    }

    public void takePhoto(Camera device) {
        device.takePhoto();
    }
}

/*
 * Here is exactly what is happening in a few words:Your PhoneService is
 * completely decoupled and flexible.
 * 
 * makeCall(Callable device) accepts any
 * object in the world as long as it has calling capabilities. It doesn't care
 * if it's a Samsung, an iPhone, or a Smartwatch.takePhoto(Camera device)
 * accepts any object as long as it has a camera. It doesn't care if it's a
 * phone, a tablet, or a drone.By using interfaces as method parameters, your
 * service focuses entirely on what actions a device can do, rather than what
 * brand the device is. This allows you to add new devices later without
 * changing a single line of code in this class.
 * 
 *  and for here the objects are in the 
 * 
 */
