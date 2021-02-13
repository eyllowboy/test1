package Task3;

import java.io.IOException;

public class Task35 {
    public static void test() throws IOException {
        Runner run = new Runner();
        try {
            run.halt();
        } catch (RuntimeException e) {
            System.out.println("halt");
        }
    }
    public static void main(String[] args) {
        try {
            test();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
