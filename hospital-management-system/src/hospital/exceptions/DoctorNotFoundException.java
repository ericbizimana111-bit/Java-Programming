package hospital.exceptions;

public class DoctorNotFoundException extends Exception {

    //the constuctor (it accepts a string called message)
    // "Doctor not found" is passed into String message
    //so internally message = " Doctor not found"
    public DoctorNotFoundException(String message) {

        //super refers to the parent class and the parent class is Exception
        //so  super(message); means call the constructor of the Exception and give it this message 
        super(message);
    }
}

// 3. extends Exception

// This is one of the most important parts extends Exception
// It means:

// DoctorNotFoundException is
// a type of Java Exception.

// Think of
// the relationship like this:

// Exception↑|
// DoctorNotFoundException

// Because it extends Exception,
// Java recognizes
// it as
// an exception
// that can be:

// thrown 
// caught
// handled







/* 
The relationship is:

DoctorNotFoundException
        |
        | extends
        ↓
     Exception



When you do:
new DoctorNotFoundException("Doctor not found");
the message is passed to the parent Exception class.
Later you can retrieve it with:
getMessage()



For example:

try {
    throw new DoctorNotFoundException("Doctor was not found");
} catch (DoctorNotFoundException e) {
    System.out.println(e.getMessage());
}
     


     */