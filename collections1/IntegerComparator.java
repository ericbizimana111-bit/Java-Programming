package collections1;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {

  @Override
  public int compare(Integer num1, Integer num2) {
    // TODO Auto-generated method stub
    // ascending order
    if (num1 % 10 > num2 % 10) {
      return 1;
    } else {
      return -1;
    }

  }

}

// when num1 > num2 it return postive so it measn it take num2 as the number
// that should come infront
// when num1 < num2 it retruns negative