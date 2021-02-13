package VideoCourse.comporation.multitreading;

public class example2 {
    public static void main(String[] args) {
        Mythread5 myThread5=new Mythread5();
        myThread5.setName("moy Potok");
        myThread5.setPriority(Thread.MAX_PRIORITY);
        System.out.println("My thread5=    "+myThread5.getName()+
                "     Priority      "+myThread5.getPriority());

    }
}
class Mythread5 extends Thread{
    @Override
    public void run() {
        System.out.println("Privet");
    }
}
