import java.util.LinkedHashSet;
import java.util.Set;

public class InsertSet {
    public static void main(String[] args) {

        Set<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(25);
        numbers.add(5);
        numbers.add(40);
        numbers.add(25); 

        System.out.println("Elements in insertion order:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}