package VideoCourse.comporation.multitreading;

public class SynchronizedBlock1 {
    public static void main(String[] args) {
        MyRunnableImpl2 runs = new MyRunnableImpl2();
        Thread thread1 = new Thread(runs);
        Thread thread2 = new Thread(runs);
        Thread thread3 = new Thread(runs);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter2 {
    static int count = 0;

}

class MyRunnableImpl2 implements Runnable {

        public void doWork1 () {
        synchronized (this){
        Counter2.count++;
        System.out.println(Counter2.count);
    }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }

    }
}
