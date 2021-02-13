package VideoCourse.comporation.multitreading;

public class DaemanExample {
    public static void main(String[] args) {
        System.out.println("Main thread starts");
        UserThread thread1= new UserThread();
        thread1.setName("user+thread");
        DaemanThread thread2= new DaemanThread();
        thread2.setName("daeman+thread");
        thread2.setDaemon(true);
        thread2.start();
        thread1.start();


        System.out.println("Main thread ends");
    }
}
class UserThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"is daemin: "+ isDaemon());
        for(char i= 'A';i<='J';i++){
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class DaemanThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"is daemin: "+ isDaemon());
        for(int i= 1;i<=1000;i++){
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
