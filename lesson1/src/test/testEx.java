package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("siarhei");
        list.add("pasha");
        list.add("koly");
        list.add("dima");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}