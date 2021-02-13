package VideoCourse.comporation.multitreading;

public class exampl5 {
    public static void main(String[] args) {
        MyRunnableImpl1 runs= new MyRunnableImpl1();
        Thread thread1= new Thread(runs);
        Thread thread2= new Thread(runs);
        Thread thread3= new Thread(runs);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter {
    static int count = 0;

}

class MyRunnableImpl1 implements Runnable {
    public synchronized void increment() {
        Counter.count++;
        System.out.println(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }

    }
}