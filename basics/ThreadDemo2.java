// By implementing the Runnable interface
class MyThread implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        t1.start();
    }
}
