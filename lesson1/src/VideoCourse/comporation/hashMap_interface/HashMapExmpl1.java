package VideoCourse.comporation.hashMap_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapExmpl1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000,"siarhei");
        map1.put(1100,"Ivan ivanov");
        map1.put(1200,"maia sidorova");
        map1.putIfAbsent(1200,"maia petrova");
        map1.put(null,"maia xxx ");
        System.out.println(map1.keySet());



    }
}
