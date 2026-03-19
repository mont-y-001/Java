// sequence of elements that can be processed in a pipeline of operations such as filtering,mapping,sorting and reducing. is called stream.
// stream donot store data we have to store them in collection.
package streamapi;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {

        List<Integer> data = Arrays.asList(23, 45, 12, 56, 78, 90);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(73);
        list.addAll(List.of(34, 56, 78));
        list.addAll(data);

        System.out.println(list);
        // list<Integer> g50 = list.stream().filter(n->n>50).collect(Collectors.toList());

        // Stream operation
        list.stream()
            .filter(n -> n%2==0)
            .forEach(System.out::println);
            // System.out.println();
            // System.out.println(g50);
    }
}