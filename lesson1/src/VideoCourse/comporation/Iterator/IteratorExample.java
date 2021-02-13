package VideoCourse.comporation.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("Siarhei");
        list.add("Pavel");
        list.add("Koly");
        Iterator<String> iter= list.iterator();
        while(iter.hasNext()){
            iter.next();
            iter.remove();

        }
        System.out.println(list);
    }
}
