package collections1;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Iterator;
// import java.util.Collections;;

// class DemoList {

// public static void main(String[] args) {

// List<Integer> list = new ArrayList<Integer>();
// list.add(45);
// list.add(34);
// list.add(67);
// list.add(91);

// Collections.sort(list);
// Iterator<Integer> it = list.iterator();
// while (it.hasNext()) {
// System.out.println(it.next());
// }
// // Next returns true or false

// }

// }

// //i want to order them based on the last digit
// //

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;

class DemoList {

  public static void main(String[] args) {
    
    IntegerComparator com = new IntegerComparator();

    List<Integer> list = new ArrayList<Integer>();
    list.add(45);
    list.add(34);
    list.add(67);
    list.add(91);

    Collections.sort(list, com);
    Iterator<Integer> it = list.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
    // Next returns true or false

  }

}

// i want to order them based on the last digit
//
