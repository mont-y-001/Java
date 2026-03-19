import java.lang.Thread;
class YourThread extends Thread {
    public void run() {
        System.out.println(getName() + " with priority " + getPriority());
    }
}

public class ThreadPriorityDemo {
    public static void main(String args[]) {

        YourThread t1 = new YourThread();
        YourThread t2 = new YourThread();
        YourThread t3 = new YourThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        t1.start();
        t2.start();
        t3.start();
    }
}
