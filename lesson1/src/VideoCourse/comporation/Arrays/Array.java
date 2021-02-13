package VideoCourse.comporation.Arrays;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("Siarhei");
        list.add("Pavel");
        list.add("Koly");
        list.add(1,"Misha");
        ArrayList<String> list1= new ArrayList<>();
        list1.add("S");
        list1.add("P ");
        list1.add("K ");

        list.addAll(1,list1);
        list.indexOf("S");

        System.out.println(list.contains("C ") );

    }

}
