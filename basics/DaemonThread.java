class DaemonThread extends Thread {
    public void run() {
        if (isDaemon()) 
            System.out.println("Daemon Thread");
        else
            Ssytem.out.println("User Thread");
    }
}

public class DaemonThreadDemo {
    public static void main(String args[]) {
        DaemonThread dt1 = new DaemonThread();
        DaemonThread dt2 = new DaemonThread();
        dt1.setDaemon(true);
        dt1.start();
        dt2.start();
    }
}
