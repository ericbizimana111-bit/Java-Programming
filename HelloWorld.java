// /**
//  * HelloWorld
//  */
// public class HelloWorld {

//     public static void main(String[] args) {
//         System.out.println("Hello World");
//     }
// }

//---------local varibles--------------// used inside the main method 
//   class HelloWorld{
//     public static void main(String[] args){

//       int age;  //this is the local variable inside the main method 
//       age = 89;

//       System.out.print("I am " + age + " years old" );

//     }
//  } 

// class HelloWorld {

//     static int age = 47;  

//     public static void main(String[] args) {

//         System.out.print("I am " + age + " years old");

//     }
// }

/* 
class HelloWorld {

    static int age = 47;
    //when int is declared outside of the main method without the static it can not be accessed inside the main method 
    //but when we add static that age is accessed in the main method and can be printed like shown below 
    //when i say int age  = 47  this means age belongs to an object not direclty to the class 
    //static belongs to the class 
    //non-static belongs to an object 

    // main() is static, which means it belongs to the class itself and can run
    // without creating an object. A normal 
    // +variable like int age = 47 belongs to an
    // object, so main() cannot access it directly because main() is not inside an
    // object. When we add static to age, it also belongs to the class instead of an
    // object. This allows the static main() method to access age directly and print
    // its value. So, remember: static belongs to the class, while non-static
    // belongs to an object.

    public static void main(String[] args) {

        System.out.print("I am " + age + " years old");

    }
} */

/* 
//====varibles in java====//

public class HelloWorld {
public static void main(String[] args) {
    int 0age; //Not allowed 
    int my age; //Not allowed 

    int $age; //allowed varible can start with the dollar sign 
    int _age; //allowed varible can start  with the underscore

    int a; //Not allowed varibles with the single letters 
} 
}

*/

/* 
//==== Data Types ====//

class HelloWorld {
    public static void main(String[] args) {

        // Integer types
        byte aByte = 100; // -128 to 127
        short aShort = 2000;
        int anInteger = 100000;
        long aLong = 10000000000L; // L means long

        // Decimal types
        double aDouble = 10.5;
        float aFloat = 5.5F; // F means float

        // Boolean type
        boolean isWeekend = true;
        boolean isWorkday = false;

        // Character type
        char percentSymbol = '%';

        // Print values
        System.out.println("Byte: " + aByte);
        System.out.println("Short: " + aShort);
        System.out.println("Integer: " + anInteger);
        System.out.println("Long: " + aLong);
        System.out.println("Double: " + aDouble);
        System.out.println("Float: " + aFloat);
        System.out.println("Is it weekend? " + isWeekend);
        System.out.println("Is it workday? " + isWorkday);
        System.out.println("Percent symbol: " + percentSymbol);   //one character, use ' ' not " "


        byte → small whole numbers
        short → slightly larger whole numbers
        int → normal whole numbers
        long → very large whole numbers, use L
        double → decimal numbers
        float → decimal numbers, use F
        boolean → true or false
        char → one character, use ' ' not " "
    }
} */

// //SDK software development kit 

/*
public class HelloWorld {

    public static void main(String[] args) {

        boolean isStudent = false;
        boolean isLibrary = true;

        System.err.println(isLibrary || isStudent);

    }
} */

/* 
class HelloWorld{
public  static void main(String[] args){
// int divided by an integer gives an integer 
// a dobule divided by a double gives the double value
// a double, a float  divided by integer gives always a double 
    int number1 = 12;
    float number2 = 6;

    System.out.println(number1 + number2);
    System.out.println(number1 - number2);

    // % is called modulo or modulus
    System.out.println(number1 % number2);
    System.out.println(number1 * number2);
    

}
}*/

/*
class HelloWorld {
    public static void main(String[] args) {

        // int score = 0;
        // int turns = 10;

        // score++;
      

        // System.out.println(score); 
       

        // System.out.println(++score);  //1
        // System.out.println(score); //1
    
        // System.out.println(score++);  //0
        // System.out.println(score++);  //1

        
        // System.out.println(turns++); //10
        // System.out.println(turns++);  //11
    }
}
 */

/* 







                   //=======================================strings===========================================//



public class HelloWorld {

    public static void main(String[] args) {
        // String name = "Bizimana Eric";
        // System.out.println(name);

        // String name =new String("The king of the jungle");
        // System.out.println(name);


        String literalString1 = "abc";
        String literalString2 = "abc";

        String objectString1  = new String("xyz");  //when you say new java direclty creates the new object, one string object 
        String objectString2  = new String("xyz");  //this is creating another new object 

        System.out.println(literalString1 == literalString2); //true  
        // Because both variable refer to the same object , java creates what we call string pool (preserving the memory) and then it puts abc 
        //and then if it goes to objectString2 Java sees that "abc" already exists in
        // the String Pool, so it reuses the same String object:

        //     String Pool

        //       ┌─────────┐
        //       │  "abc"  │
        //       └─────────┘
        //          ↑   ↑
        //          │   │
        //          │   │
        //  literalString1
                    //  literalString2
        //therefore literalString1 == literalString2 because both varibles refer to the same object 

        // string pool  ┌────────┐
        // a ──────────→│        │
        // b ──────────→│ "Java" │
        // c ──────────→│        │
        //              └────────┘

        System.out.println(objectString1 == objectString2); //false
        //Because eventhough their contents are identical They are two different objects


        //use .equals if you want to compare the content values 


    }

    
}  





class HelloWorld {
    public static void main(String[] args) {

        String name = "Bizimana Eric";
        String country = "America";
        int age =18;
        String company = "Fecasenam software ai engineering company";
        double gpa = 3.8;
        char percentSign ='%';
        boolean amITellingTheTruth =false;
 
        //String.format() lets you create a string using the placeholders
        String formattedString = String.format("My name is %s. I live in %s. i am %d years old.  I work in %s company.My gpa is %.2f . i have attended 100%c of my university class These are all %b claims",
        name ,country,age ,company , gpa, percentSign,amITellingTheTruth);

        System.out.println(formattedString);
        // | Placeholder | Meaning               | Example          |
        // | ----------- | --------------------- | ---------------- |
        // | `%s`        | String                | `"Eric"`         |
        // | `%d`        | Integer               | `18`             |
        // | `%f`        | Floating-point number | `3.8`            |
        // | `%c`        | Character             | `'%'`            |
        // | `%b`        | Boolean               | `true` / `false` |

        //%s %d %f %c %b These are called format specifiers 
        //System.out.println("Hello people I am " + name + " I come from " + country + " and i am "+ age +" years old and i work for the company called  " + company);
    }

} 


public class HelloWorld {

    public static void main(String[] args) {

        String name = "The sky is blue";

        String updatedString = name.replace("sky","water");
        System.out.println(updatedString);
        System.out.println(name.contains("sky"));
        System.out.println(name.contains("freecodecamp"));


        // String name ="Bizimana Eric";
        // String name1 = new String("abc");
        // String name2 = new String("ABC");
  
        //System.out.println(name1.equalsIgnoreCase(name2));

        //System.out.println(name1.equals(name2));//true because it only compare the values of the strings only it check if hte content and the case are the same 
         
        //System.out.println(name1 == name2); //false because name1 and name2 they are not in the same object eventhough they have same values
        //== checks wether they are in the same object 


        // System.out.println(name.length());
        // System.out.println(name.isEmpty());
        // System.out.println(name.toUpperCase());
        // System.out.println(name.toLowerCase());
        // System.out.println(name.charAt(9)); //give the character of the string at the specific index
        // System.out.println(name.substring(2));
        // System.out.println(name.contains("Eric"));



    }
} 

import java.util.Scanner;
//util is a package containign useful classes for example  Scanner , ArrayList , Random , Date 
//import is ajava key word
//i want to use the scanner class that java provides 
//Scanner is a java class that allowes your program to read the input 4

public class HelloWorld {
    // classes in java nomally use PascalCase
    public static void main(String[] args) {

       //args is the variable that cna hold an array of string values 


        //Static means the method belogn to the class rather than a particular object
        // A static member belongs to the class itself rather than to an instance of that class.
        //JVM looks for the main method as the standard dentry poitn for traditional java application 
        // public is an access modifier it means the class can be accessed form outside its package 
        // its package //accessible form the other parts of the program 4
        // static means the method belongs to the class rather than a particular object
        // to take the input from the user we use the scanner object
        //printf means print formatted

        Scanner scanner = new Scanner(System.in); 
        //This creates the scanner object 
        // System in means standard input from your keyboard

        System.out.println("what is your name? ");
        String name = scanner.nextLine();  //nextLine reads a line of text it read the nextline from the user and store it as the string  //this is the one that allows you to put the input 

        System.out.printf("Hello %s.\nHow old are you?\n", name);
        int age = Integer.parseInt(scanner.nextLine());  //nextInt read an integer  //this is the one that allows you to put the input 

        //this cleans up the input buffer that was left by the next int
        scanner.nextLine();

        System.out.printf("%d is an excellent age to start programming.\nWhat Language do you prefer?\n", age);
        String language = scanner.nextLine();  // this is the one that allows you to put the input

        System.out.printf("%s is a good programming language.\nwhat is your favorite food\n", language);
        String food = scanner.next(); // this is the one that allows you to put the input

        System.out.printf("%s is very delicious", food);

        scanner.close();
    }

}    */

// import java.util.Scanner;

// public class HelloWorld {

//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);

//         System.out.printf("Input the first number:");
//         double number1 = scanner.nextDouble();
//         scanner.nextLine();

//         System.out.printf(("Input the second number:"));
//         double number2 = scanner.nextDouble();
//         scanner.nextLine();

//         System.out.print("What operation do you want to perform? ");
//         String operation = scanner.nextLine();

//         // switch (operation) {
//         //     case "sum":
//         //         System.out.printf("%f + %f = %f ", number1 , number2 , number1 + number2);
//         //         break;
//         //     case "div":
//         //         if (number2 == 0) {
//         //             System.out.print("Division by zero is not possible");
//         //         }
//         //         System.out.printf("%f / %f = %f ", number1 , number2 , number1 / number2);
//         //         break;

//         //     default:
//         //         System.out.println("operation is invalid");
//         //         break;
//         // }

//         /* 
//         if (operation.equals("sum")) {

//             System.out.printf("%f + %f = %f ", number1, number2, number1 + number2);

//         } else if (operation.equals("sub")) {

//             System.out.printf("%f - %f = %f ", number1, number2, number1 - number2);

//         } else if (operation.equals("mul")) {

//             System.out.printf("%f * %f = %f ", number1, number2, number1 * number2);

//         }else if (operation.equals("div")){

//             if (number2 == 0) {

//                 System.out.println("Cannot divide by 0");

//             }else {

//                 System.out.printf("%f / %f = %f ", number1 , number2 , number1 / number2);
//             }

//         } */

//         // System.out.println(number1);
//         // System.out.println(number2);

//         scanner.close();

//     }
// }

/*
// import java.util.Arrays;

// import java.lang.reflect.Array;
// import java.util.ArrayList;
// import java.util.ArrayList;
// import java.util.Arrays;;
//import java.util.Comparator;;

public class HelloWorld {

    public static void main(String[] args) {

        // char vowels[] = new char[5];
        // // creates a character array called vowel that can store 5 characters
        // // Create an array named vowels that can hold 5 char values.
        // // char is a java data type used to store one character
        // // new char[5] creates a new character array with space for 5 characters
        // // char[] vowels = {'a','b','c'}

        // vowels[0] = 'a';
        // vowels[1] = 'e';
        // vowels[2] = 'i';
        // vowels[3] = 'o';
        // vowels[4] = 'u';

        // char vowels[] = { 'a', 'e', 'i', 'o', 'u' }; //charctera rrays

        // char[] vowels = { 'a', 'e', 'i', 'o', 'u' }; //more common java style

        // Arrays.sort(vowels);
        // int startingIndex = 1; //where to start on filling
        // int endingIndex = 4; //this one is not included to be filled

        // //START included, END excluded for the methods like this in java
        // Arrays.fill(vowels, startingIndex , endingIndex, 'x'); // Arrays.fill(array,
        // fromIndex, toIndex, value);
        // System.out.println(Arrays.toString(vowels));

        // Arrays.sort(vowels); //sorts the character in ascending order

        // char key = 'o'; //if key is not there -1 is give meaning that it is not found
        // //the key of what i am finding index for
        // int foundItemIndex = Arrays.binarySearch(vowels, key); //this means find the
        // key in the vowels arrasy and give me it's index
        // when usign binary search it is better to use the arrays.sort because it firs
        // sort them like the letter it compare theri unicode values

        // System.out.println(vowels); //aeiou
        // System.out.println(Arrays.toString(vowels)); // That [a, e, i, o, u] is the
        // string representation of the array produced by Arrays.toString().
        // System.out.println(foundItemIndex);

        // vowels[2] = 'x'; //vowels[9] = 'v'; it says you are going out of the bounds
        // for length 5
        // vowels[1] = 'b';

        // int numbers[] = {1,2,3,4,5};

        // int copyOfNumbers[] = Arrays.copyOf(numbers, 2);
        // //means create a new int array containing the first 2 elements of the numbers
        // array

        // System.out.println(Arrays.toString(copyOfNumbers));

        // int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // int sum = 0;

        // for (int index = 0; index < numbers.length; index++) {

        // sum = sum + numbers[index];
        // // System.out.println(numbers[index]);
        // System.out.println(sum);
        // }

        // int multiplier = 5;
        // for (int i = 1; i <= 10; i++) {

        // System.out.printf("%d * %d = %d \n",
        // multiplier, i, i * multiplier);

        // }

        // for (int i = 1; i <= 10; i++) { //ROW
        // for (int j = 1; j <= 10; j++) { //COLUMN
        // System.out.printf("%d * %d = %d \n", i, j, i * j);
        // }
        // System.out.println();
        // }

        // : this one is called the colon

        // for (int i = 1; i <= 50; i++) {
        // if (i % 2 == 1) {
        // System.out.println(i);
        // }
        // }

        // int[] numbers = { 1, 2, 3, 4, 5 };

        // int sum = 0;

        // for (int number : numbers) { // This means for every integer number in the
        // numbers arrays be stored into the
        // // number variable
        // sum += number;

        // // System.out.println(number); // then print that number
        // }
        // System.out.println(sum);

        // int number = 5;
        // int multiplier = 1;

        // do {

        // System.out.printf("%d * %d = %d \n", number , multiplier , number *
        // multiplier);
        // multiplier++;

        // }while(multiplier <= 10);

        // while ( multiplier <= 10 ) {

        // System.out.printf("%d * %d = %d \n", number , multiplier , number *
        // multiplier);
        // multiplier++;

        // }

        // ArrayList<Integer> numbers = new ArrayList<Integer>();
        // means create an empyt list that can store the integer
        // ArrayList is a java collection that stores multiple values think of it like
        // the flexible array unlike the normal array int[] numbers = new int[5];
        // an arraylist can grow and shrink as you add or remove elements respectively
        // Integer this tell the arraylist that it will store integer values
        // I want a varible called numbers that refers to an ArrayList of integers
        // new ArrayList<Integer>(); this actually creates the arrayList in the memory

        // numbers.add(1);// index 0
        // numbers.add(3);// index 1
        // numbers.add(2);// index 2
        // numbers.add(4);// index 3
        // numbers.add(5);// index 4

        // System.out.println("before" + numbers.toString());

        // numbers.forEach(number -> {
        //     // System.out.println(number * 2);
        //     numbers.set(numbers.indexOf(number), number * 2);
        //     // This will change the ArrayList numbers to change the index reached value by
        //     // multiplying it for two
        // });

        // System.out.println("After " + numbers.toString());

        // System.out.println(numbers.isEmpty());

        // System.out.println(numbers.contains(Integer.valueOf(5)));
        // System.err.println(numbers.containsAll(numbers)); true

        // System.err.println(numbers.size()); //numbers.size() is used to return the
        // tootal numberr of the elements in the array list
        // numbers.sort(Comparator.reverseOrder()); //This return the arraylist of the
        // numbersin the reverse order or the decreasing order
        // numbers.sort(Comparator.naturalOrder()); //naturalOrder is the method of
        // comparator here we are saying arrange the following n their natural order
        // arranging thing int he natural or increaing order
        // System.out.println(numbers.toString());

        // number.set(index, newValue);
        // numbers.set(2, Integer.valueOf(30));
        // Integer.valueof(30); this one creates an integer containing the value 30
        // numbers.set(1, 6876543); //This one is used within an ArrayList to
        // replace/change a value at a specific index
        // System.out.println(numbers.get(2));

        // numbers.clear(); //this removes all the elments from the array list
        // numbers.remove(Integer.valueOf(1));
        // //this one removes the value 1

        // numbers.remove(1);
        // Because 1 is an int, Java interprets this as:Remove the element at index 1
        // and then the indexes shift bcs here 3 as the valued added will be

        // System.out.println(numbers.get(0)); // This helps to get the specific number
        // at the specified index;
        // System.out.println(numbers.get(2));

    }

} 

import java.util.HashMap;

public class HelloWorld {

    public static void main(String[] args) {

        // Java, HashMap is a part of the Java Collections Framework that implements the
        // Map interface. It is a hash table-based implementation of the Map interface.
        // A HashMap is an associative array that stores key-value pairs, where each key
        // is unique and maps to a

        // HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        // examScores.put("Math", 100);
        // examScores.put("physics", 10);
        // examScores.put("English", 100);
        // examScores.put("Java", 100);
        // examScores.put("c++", 100);

        // System.out.println(examScores.containsValue(Integer.valueOf(100)));

        // System.err.println(examScores.containsKey("Math"));
        // System.err.println(examScores.containsValue(100));
        // System.out.println(examScores.hashCode());

        // examScores.clear();
        // examScores.remove("Math"); // this one removes the key named Math

        // System.out.println(examScores.size());

        // System.out.println(examScores.toString());
        // System.out.println(examScores.get("Heg")); //this retuns null because heg is
        // not found as the key
        // System.out.println(examScores.get("physics"));
        // examScores.replace("Math", 70);
        // examScores.putIfAbsent("Ge ography", 10); // this add the key as Geography
        // and
        // 10 as the marks of Geography
        // System.out.println(examScores.toString());
        // System.out.println(examScores.get("English")); //this is that we want the
        // score of english


    }
}
*/
import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {

        User youngUser = new User(); //creation of the object 

        youngUser.name = "Bizimana Eric";
        youngUser.birthDay = LocalDate.parse("1995-01-31");

        System.out.printf("%s was born in %s",youngUser.name,youngUser.birthDay);

    }

}