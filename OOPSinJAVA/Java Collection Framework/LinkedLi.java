import java.util.*;

public class LinkedLi {
public static void main(String[] args) {
LinkedList<String> list = new LinkedList<>();
// adding elements
list.add("A");
list.add("B");
list.add("C");
list.addFirst("Start");
list.addLast("End");
// printing list
System.out.println("LinkedList: " + list);
// accessing elements
System.out.println("First: " + list.getFirst());
System.out.println("Last: " + list.getLast());
// removing elements
list.removeFirst();
list.removeLast();
// iterating
for(String s : list) {
System.out.println("Item: " + s);
}
}
}