package Generics;

import java.util.List;
import java.util.ArrayList;
// class DisplayName {

//   public static void main(String[] args) {

//     String name = "Jane";
//     int age = 16;

//     // displayValue(name);
//     // displayValue(age)
//     String nameResult = displayValue(name);
//     int ageResult = displayValue(age);

//     System.out.println("Name: " + nameResult);
//     System.out.println("Age: " + ageResult);

//   }

//   // public static <T> void displayValue(T value) {
//   // System.out.println("value" + value);
//   // }
//   public static <T> T displayValue(T value) {
//     return value;
//   }
// }

class DisplayName {

  public static void main(String[] args) {

    List<String> names = new ArrayList<>();

    names.add("Mariew");
    names.add("Alien");

    List<Integer> num = new ArrayList<>();

    num.add(4);
    num.add(5);

    displayValue(names);
    displayValue(num);
  }

  public static <T> void displayValue(List<?> list) {

    for (Object obj : list) {
      System.out.println(obj);
    }
  }
}