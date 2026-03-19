package sort;
import java.util.*;
public class BubbleSort{
    public static void BSort(int[]arr){
        int n = arr.length;
       for(int i = 0;i<n;i++){
        for(int j = 0;j<n-i-1;j++){
        if(arr[j]>arr[j+1]){
            int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
        }
        }
       }
    }
    public static void main(String[] args) {
        int[]arr = {64,34,25,12,22,11,90};
        BSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}