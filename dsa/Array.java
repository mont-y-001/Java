package dsa;
import java.util.*;

public class Array{
    public static void main(String args[]){
        //Static
        int arr[] = {10,15,18,22,45,56};
        System.out.println(Arrays.toString(arr));
        System.out.print("Primitive Array->");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        //Dynamic
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

           // Non-primitive array (String objects)
        String[] names = {"Lakshit", "Rahul", "Pankaj"};

        System.out.print("Non-Primitive Array -> ");
        for (int i = 0; i < names.length; i++)
            System.out.print(names[i] + " ");
        
    }
}