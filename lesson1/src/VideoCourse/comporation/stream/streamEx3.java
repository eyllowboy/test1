package VideoCourse.comporation.stream;

import java.util.ArrayList;
import java.util.List;

public class streamEx3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);
       int i=list.stream().reduce((accum,element)->accum*element).get();
        System.out.println(i);
        int ii=list.stream().reduce(1,(a,e)->a*e);
    }
}
