package streamapi;
import java.util.*;

public class even {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10,15,20,25,30,30,20,20,11,17,16);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(data);
         System.out.println(list);
        list.stream().
        distinct().
        filter(n->n>15).
    
        forEach(System.out::println);
    }
}
