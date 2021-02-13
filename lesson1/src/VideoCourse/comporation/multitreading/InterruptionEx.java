package VideoCourse.comporation.multitreading;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");
        InterruptedThread thread= new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
        thread.join();
        System.out.println("main end");
    }
}
class InterruptedThread extends Thread{
    double sqrtSum=0;
    @Override
    public void run() {
        for(int i=1;i<=1000000000;i++){
            if(isInterrupted()){
                System.out.println("Potok hotyt prerpvat");
                System.out.println("zavershaem raboty");
                System.out.println(i);
                return;
            }
            sqrtSum+=Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Potok hotyt prervat vo vremy sna zavershaem raboty");
                System.out.println(i);
            }
        }
        System.out.println(sqrtSum);
    }
}