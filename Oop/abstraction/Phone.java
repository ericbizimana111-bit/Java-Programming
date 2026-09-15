package Oop.abstraction;

public abstract class Phone {
    // i want this phone to be abstract
    String phoneNumber;

    // method for calling
    public abstract void call(); // on this abstract method there is no method body we are onlu declaring the
                                 // requirement every vehicle must have a start() method

    public String getMyNumber() {
        return "phone number is" + phoneNumber;
    }
}
// ================== ABSTRACT CLASSES ================= //

// 1. "Abstract classes can have BOTH abstract and regular methods"
// The Reality: An abstract class is incredibly flexible.
// It can have abstract methods (methods without a body, like your call();)
// AND regular (concrete) methods (methods with a body, like your
// getMyNumber()).
// It is a hybrid—part blueprint, part fully functional class.



// 2. "A class does NOT need an abstract method to be abstract"Your note says:
// "for a class to be abstract it may only have one method that is abstract".The
// Reality: This is a very common misconception!An abstract class can have zero,
// one, or twenty abstract methods. There is no limit.The actual rule is the
// opposite: If a class has even one abstract method inside it, the entire class
// must be marked as abstract.


// 3. "You cannot create an object directly from an abstract class"Your note
// says: "and we can not create the object using the abstract class".The
// Reality: 100% Correct! Abstract classes are incomplete conceptual ideas.If
// you try to compile Phone p = new Phone();, Java will block you with a
// compiler error. It prevents this because call() has no body—Java wouldn't
// know what code to execute if you tried to run p.call().


// 4. "You must extend them in another file to use them"Your note says: "we can
// extend them in the other file".The Reality: 100% Correct! To actually use an
// abstract class, another class must inherit it (using extends) and fill in the
// missing method bodies