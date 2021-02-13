package test1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    LinkedList list;

    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList();
        que.add(10);
        que.add(9);
        que.add(7);
        que.add(6);
        que.add(11);
        que.add(13);
        que.add(5);
        que.add(22);
        Queue<Integer> que2 = new LinkedList();
        System.out.println(que);
        for(Integer i:que){
            if(i%2==0){
                que2.add(i);
            }
        }
        System.out.println(que2);
        System.out.println(que2.peek());
        Deque<Integer> dec= new LinkedList();
        dec.addFirst(11);
        dec.addFirst(12);
        dec.addFirst(13);
        dec.addFirst(14);
        dec.addFirst(15);
        dec.addLast(21);
        dec.addLast(22);
        dec.addLast(23);
        dec.addLast(24);
        dec.addLast(25);
        System.out.println(dec);
        for(Integer i:que){
            dec.addLast(i);
        }
        for(Integer i:dec){
            dec.addLast(i);
        }
        System.out.println(dec);

    }
}
