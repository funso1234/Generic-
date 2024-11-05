package Chapter15.Collection;

import java.util.HashSet;
import java.util.Set;

public class Example2 {
    public static void main(String[] args) {
        //Arrange the number in Disorder
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println(numbers);
    }
}
