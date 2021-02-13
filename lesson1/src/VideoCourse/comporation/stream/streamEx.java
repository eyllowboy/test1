package VideoCourse.comporation.stream;

import java.util.*;
import java.util.stream.Collectors;

public class streamEx {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("poka");
        list.add("pshel");

        List<Integer> list2 = list.stream().map(el -> el.length()).collect(Collectors.toList());
        //System.out.println(list2);

        int[] array = {3, 6, 12, 13, 17, 9, 34};
        System.out.println(Arrays.toString(array));
        array=Arrays.stream(array).map(el -> {
            if (el % 3 == 0) {
                el = el / 3;

            }
            return el;
        }).toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("_________________________________");

        Set<String> set= new TreeSet<>();
        set.add("privet");
        set.add("ok");
        set.add("pshel");
        System.out.println(set);
        Set<Integer> set2=set.stream().map(el->el.length()).collect(Collectors.toSet());
        System.out.println(set2);
    }
}