package VideoCourse.comporation.HashcodeEx1;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("siarhei", "ponomarew", 3);
        Student st2 = new Student("ivanov", "ivan", 2);
        Student st3 = new Student("petrov", "petr", 4);
        treeMap.put(5.6, st1);
        treeMap.put(3.5, st2);
        treeMap.put(6.9, st3);
//        treeMap.remove(5.6);
       // System.out.println(treeMap.descendingMap());
       // System.out.println(treeMap);
        System.out.println(treeMap.headMap(5.1));
    }
}
