package VideoCourse.comporation.lamda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("priet");
        a1.add("poka");
        a1.add("ok");
        a1.add("java");
        a1.add("or not");
        // a1.removeIf(element->element.length()<5);
        Predicate<String> p = element -> element.length() < 5;
        a1.removeIf(p);
        System.out.println(a1);
    }


}
