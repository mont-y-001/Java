package streamapi;
import java.util.*;
public class filter_A {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Amit","Sumit","Akash","Apple");
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(data);
        list.stream().
        filter(name->name.startsWith("A")).
        forEach(System.out::println);
    }
}
