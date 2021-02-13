package VideoCourse.comporation.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Siarhei");
        list1.add("Pavel");
        list1.add("Koly");
        list1.add("Elena");
//        List<String> mylist = list1.subList(1, 3);
//        System.out.println(list1);
//        ArrayList<String> list2= new ArrayList<String>();
//        list2.add("S");
//        list2.add("Pavel");
//        list2.add("Koly");
//        System.out.println(list2);
//        Object[] array1 = list1.toArray();
//        String []array2=list1.toArray(new String[0]);
//        for (String s:array2){
//            System.out.println(s);
//        }
//        List<Integer> list4=List.of(3,8,13);
        List<String> list4=List.copyOf(list1);
        System.out.println(list4);
    }
}
