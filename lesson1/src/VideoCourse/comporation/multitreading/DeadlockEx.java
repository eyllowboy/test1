package VideoCourse.comporation.multitreading;

public class DeadlockEx {
    public static final Object lock1= new Object();
    public static final Object lock2= new Object();

    public static void main(String[] args) {
        Thread10 thread10= new Thread10();
        Thread20 thread20= new Thread20();
        thread10.start();
        thread20.start();
    }
}
class Thread10 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread10 Popytka zahvata monitora Lock1");
        synchronized (DeadlockEx.lock1)
        {
            System.out.println("Thread10 Monitor zahrachen lock1");
            System.out.println("Thread10 Popytka zahvata monitora lock2");
            synchronized (DeadlockEx.lock2){
                System.out.println("Thread10 Monitory lock1 and llock2 zahvacheny");
            }
        }
    }
}
class Thread20 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread20 Popytka zahvata monitora Lock2");
        synchronized (DeadlockEx.lock2)
        {
            System.out.println("Thread20 Monitor zahrachen lock2");
            System.out.println("Thread20 Popytka zahvata monitora lock1");
            synchronized (DeadlockEx.lock1){
                System.out.println("Thread10 Monitory lock1 and llock2 zahvacheny");
            }
        }
    }
}
