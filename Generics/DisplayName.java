package Generics;

class DisplayName {

  public static void main(String[] args) {

    String name = "Jane";
    int age = 16;

    // displayValue(name);
    // displayValue(age)
    String nameResult = displayValue(name);
    int ageResult = displayValue(age);

    System.out.println("Name: " + nameResult);
    System.out.println("Age: " + ageResult);

  }

  // public static <T> void displayValue(T value) {
  // System.out.println("value" + value);
  // }
  public static <T> T displayValue(T value) {
    return value;
  }
}
