package Chapter15.Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example3 {
    public static void main(String[] args) {
        //Arrange the number in Order
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println(numbers);
    }
}
