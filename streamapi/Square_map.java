package streamapi;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Square_map {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(1,2,3,4);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(marks);
        List<Integer> Square = list.stream()
        .map(n->n*n).toList();
        System.out.println("Squares: "+Square);

    }
}
