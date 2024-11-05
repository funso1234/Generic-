package Chapter15.Collection;

import Chapter15.Cat;

import java.util.Set;
import java.util.TreeSet;

public class Example4 {
    public static void main(String[] args) {
        Set<Cat> cats = new TreeSet<Cat>();
        cats.add(new Cat("jerry",10));
        cats.add(new Cat("tom",20));
        System.out.println(cats);

    }
}
