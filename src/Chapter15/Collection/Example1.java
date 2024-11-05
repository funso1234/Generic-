package Chapter15.Collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        int square = list.size();
//        System.out.println(square);

        Collection<String> names = new ArrayDeque<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        System.out.println(names);
    }

}
