package Chapter15.Collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example8 {
    public static void main(String[] args) {
        Dog dog = new Dog("Billy",10);
        Dog dog2 = new Dog("Bob",10);
        Dog dog3 = new Dog("Jack",10);

        Comparator<Dog> comparator = (x, y) -> {
            return x.getName().length() - y.getName().length();
        };
        Map<Dog, Boolean> map = new TreeMap<>(comparator);

        map.put(dog, true);
        map.put(dog2, true);
        map.put(dog3, false);

        System.out.println(map);
    }
}
