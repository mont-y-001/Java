import java.lang.Thread;

 class MThread extends Thread {

    public void run() {
        System.out.println(getName() + " -> run() started");

        try {
            Thread.sleep(1000);   // sleep()
        } catch (InterruptedException e) {
            System.out.println(getName() + " -> interrupted during sleep");
        }

        System.out.println(getName() + " -> run() ended");
    }
}

public class ThreadDemo {
    public static void main(String[] args) throws Exception {

        MThread t1 = new MThread();

        // 1. setName()
        t1.setName("Worker-1");

        // 2. getName()
        System.out.println("Thread Name: " + t1.getName());

        // 3. getState() before start
        System.out.println("State before start: " + t1.getState());

        // 4. start()
        t1.start();

        // 5. getState() after start
        System.out.println("State after start: " + t1.getState());

        // 6. join()
        t1.join();

        // 7. getState() after completion
        System.out.println("State after completion: " + t1.getState());

        System.out.println("Main thread finished");
    }
}
 

