package VideoCourse.comporation.multitreading;

public class exampl3 extends Thread{
    public void run() {
        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(new Myrunnable1());
        exampl3 thread2= new exampl3();
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Finish");
    }
}
class Myrunnable1 implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
