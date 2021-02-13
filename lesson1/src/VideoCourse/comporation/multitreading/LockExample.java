package VideoCourse.comporation.multitreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    public static void main(String[] args) {
            Call call= new Call();
            Thread thread1= new Thread (new Runnable(){
                @Override
                public void run() {
                    call.mobileCall();
                }
            });
        Thread thread2= new Thread (new Runnable(){
            @Override
            public void run() {
                call.skypeCall();
            }
        });
        Thread thread3= new Thread (new Runnable(){
            @Override
            public void run() {
                call.whatsUppCall();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
   }
}
class Call{
    private Lock lock = new ReentrantLock();
           void mobileCall(){
               lock.lock();
               try {
                   System.out.println("Mobile call starts");
                   Thread.sleep(3000);
                   System.out.println("Mobile call ends");
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               finally{
                   lock.unlock();
               }
           }
    void skypeCall(){
        lock.lock();
        try {
            System.out.println("Skype call starts");
            Thread.sleep(3000);
            System.out.println("Skype call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally{
            lock.unlock();
        }
    }
    void whatsUppCall(){
        lock.lock();
        try {
            System.out.println("whatsUppCall call starts");
            Thread.sleep(3000);
            System.out.println("whatsUppCall call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally{
            lock.unlock();
        }
    }
}