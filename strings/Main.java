package strings;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

  public static void main(String[] args) {

    Collection<Object> c = new ArrayList<>();

    c.add("Jane");
    c.add("Marius");
    c.add(2);

    // for (Object obj : c) {
    // System.out.print("values:", + obj);
    // }

    for (Object obj : c) {
      int num = (Integer) obj;
      System.out.println("value:" + num);
    }

  }

}