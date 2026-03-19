package streamapi;
import java.util.*;


public class Int_Str_map {
    public static void main(String[] args) {
        List<Integer> Num = Arrays.asList(1,2,3,4);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(Num);
        List<String> Str = list.stream()
        .map(n->String.valueOf(n))
        .toList();
        System.out.println("Integer to String: "+Str);
     
    }
}
