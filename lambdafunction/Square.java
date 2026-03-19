package lambdafunction;

import java.util.*;

public class Square {
    public static void main(String[] args) {
        Function<Integer,Integer> square = n->n*n;
        System.out.println(square.apply(5));
        System.out.println(square.apply(9));
    }
}
