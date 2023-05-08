package Day4task;

import java.util.ArrayList;

public class ArrayListFilterDemo {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(12);
    numbers.add(3);
    numbers.add(8);

    numbers.removeIf(n -> n % 2 == 0);
     System.out.println("Filtered List: " + numbers);
  }
}
