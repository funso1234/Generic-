package Chapter15.Collection;

import Chapter15.Cat;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Example6 {
    public static void main(String[] args) {
//        Queue<Cat> cats = new PriorityQueue<>();
//        cats.add(new Cat());
//        cats.add(new Cat());
//        cats.add(new Cat());
//        cats.add(new Cat());
//
//        System.out.println(cats);

        Queue<Cat> cats = new ArrayBlockingQueue<>(3);
        cats.offer(new Cat("Tom",19));
        cats.offer(new Cat("Jack",20));
        cats.offer(new Cat("Jerry",18));
        cats.offer(new Cat("Josh",17));

        cats.poll();

        System.out.println(cats);
    }
}
