package Chapter15.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example7 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);
        map.put("FOUR", 4);
        map.put("FIVE", 5);

        System.out.println(map);
    }
}
