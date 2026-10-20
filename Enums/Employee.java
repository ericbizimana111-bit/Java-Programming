package enums;

import java.util.Objects;

public class Employee {

  int id;
  String name;
  
public boolean equal (Object obj){
  Employee o
}
  public static void main(String[] args) {
    
    Employee e1 = new Employee();
    e1.id = 1;
    e1.name = "hope";

    Employee e2 = new Employee();
    e2.id = 1;
    e2.name = "BRuce";

   

    System.out.println((e1.equals(e2)));
    String name1 = new String("Aline");
    String name2 = new String("Aline");
    System.out.println(name1.equals(name2));


    //equal receives the object as the parameter
    //equals is for object calss , it comparess using this ==  this compares  reference values 
    //hascode provide int value
    //when you override the equals you need to providethe hashcode 
    //likde the elements index indentifying them 
    //they may have the same hashcode but they may not be equal
    // set < Employees > set = new Hashset<Employee<>();
    // set.add(e1);
    // set.add(e2);
    // System.out.println(set.size());
    // set<String> set2 = new Hashset<>();
    // set.add(name1);
    // set.add(name2);
    //may have the same shascode but are lcoated in different locatiosn 
    //to see if hte obect are equal we check on hashcode and equals 
    // system.out.println ( e1.hashcode);
    // system.out.println ( e1. hashcode);
    // for the object to be qual they should b=have the same hashcode and equals
    // hash set .  take athe element to be equal when they have the seame equals and hashcode
    // hashmap
    // hashcode 
    // hashset
    // triset 
    

  }
}
