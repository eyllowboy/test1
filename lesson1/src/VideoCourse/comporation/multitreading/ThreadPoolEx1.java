package VideoCourse.comporation.multitreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolEx1 {
    public static void main(String[] args) {
        ExecutorService executporService= Executors.newFixedThreadPool(5);
        for(int i=0;i<10;i++){
            executporService.execute(new RunnableImp100());
        }
        System.out.println("Main ends");
    }
}
class RunnableImp100 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}