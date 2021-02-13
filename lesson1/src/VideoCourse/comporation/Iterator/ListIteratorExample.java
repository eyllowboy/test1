package VideoCourse.comporation.Iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            list.add(ch);
        }
        System.out.println(list);
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> revorseiterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while (iterator.hasNext() && revorseiterator.hasPrevious()) {


            if (iterator.next() != revorseiterator.previous())
            {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Palindrom");
        }
        else {
            System.out.println("ne palindrom");
        }
    }
}

