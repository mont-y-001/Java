import java.lang.Thread;

// start() creates a new thread and then calls run() internally, whereas calling run() directly does not create a new thread.
class MyTask implements Runnable {
public void run() {
System.out.println("Task is running...");
}
}
public class DemoThread {
public static void main(String[] args) {
MyTask task = new MyTask();
Thread t = new Thread(task);
t.start();
}
}
