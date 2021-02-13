package VideoCourse.comporation.multitreading;

import java.util.LinkedHashSet;
import java.util.Map;
public class exampl {
    public static void main(String[] args) {

        Mythread myth1 = new Mythread();
        Mythread2 myth2 = new Mythread2();
        myth1.start();
        myth2.start();
    }
}

class Mythread extends Thread {
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class Mythread2 extends Thread {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}