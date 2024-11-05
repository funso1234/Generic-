package Chapter15.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example8 {
    public static void main(String[] args) {
        Dog dog = new Dog("Billy",10);
        Dog dog2 = new Dog("Bob",10);
        Dog dog3 = new Dog("Jack",10);

        Map<Dog, Boolean> map = new TreeMap<>();

        map.put(dog, true);
        map.put(dog2, true);
        map.put(dog3, false);
    }
}
