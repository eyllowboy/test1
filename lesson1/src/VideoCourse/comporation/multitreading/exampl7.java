package VideoCourse.comporation.multitreading;

public class exampl7 {
    final static Object ob = new Object();

    void mobileCall() {
        synchronized (ob) {
            System.out.println("Mobile Call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Moble call ends");
        }
    }

    void skypeCall() {
        synchronized (ob) {
            System.out.println("Skype Call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call ends");
        }
    }

    void whatsappCall() {
        synchronized (ob) {
            System.out.println("Whatsupp Call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Whatsupp call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatsapp());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImplMobile implements Runnable {
    @Override
    public void run() {
        new exampl7().mobileCall();
    }
}

class RunnableImplSkype implements Runnable {
    @Override
    public void run() {
        new exampl7().skypeCall();
    }
}

class RunnableImplWhatsapp implements Runnable {
    @Override
    public void run() {
        new exampl7().whatsappCall();
    }
}
