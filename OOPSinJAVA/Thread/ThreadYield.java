import java.lang.Thread;

class MyyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            Thread.yield();
        }
    }
}

public class ThreadYield {
public static void main(String[] args) {
MyyThread t1 = new MyyThread();
MyyThread t2 = new MyyThread();
t1.start();
t2.start();
}
}


