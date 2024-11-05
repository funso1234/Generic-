package Chapter15.Collection;

import Chapter15.Cat;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example5 {
    public static void main(String[] args) {
        Comparator<Cat> comparator = (firstCat, secondCat) -> firstCat.getName().compareTo(secondCat.getName()
        );
        Set<Cat> cats = new TreeSet<>();
        cats.add(new Cat("Tom",10));
        cats.add(new Cat("Jack",2));
        cats.add(new Cat("Bob",3));
        cats.add(new Cat("Jack",4));
        cats.add(new Cat("Jack",50));
        System.out.println(cats);


    }

}
