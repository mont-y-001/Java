package recursion;
import java.util.*;
public class fibbonacci {
 static int fibb(int n){
     if(n==1){
        return 0;
     }
     if(n==2){
        return 1;
     }

     return fibb(n-1)+fibb(n-2);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int n = sc.nextInt();
        int ans = fibb(n);
        System.out.println(ans);
    }
}
