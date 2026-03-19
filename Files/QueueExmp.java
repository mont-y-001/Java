import java.util.LinkedList;
import java.util.Queue;

public class QueueExmp {
    public static void main(String[] args) {
        Queue<Integer> obj=new LinkedList<>();
        obj.offer(10);
        obj.offer(20);
        obj.offer(30);
        System.out.println(obj);
        System.out.println(obj.poll());
        System.out.println(obj);
    }
}