package VideoCourse.comporation.Iterator;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(-3);
        list.add(9);
        list.add(12);
        list.add(10);
        list.add(1);
        Collections.sort(list);
        int index1= Collections.binarySearch(list,13);
        System.out.println(index1);
    }
}
