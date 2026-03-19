package streamapi;
import java.util.*;

public class length {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Java","Python",null,"React",null,"Next.js","Nodejs");
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(data);
        list.stream().
        filter(n->n!=null).
        forEach(System.out::println);
    }
    
}
