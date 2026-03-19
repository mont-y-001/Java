package recursion;
import java.util.*;
public class Reverse_str {
    static void reverse(String str,int len){
        if(len<0){
return;
        } 
        System.out.print(str.charAt(len));
        reverse(str,len-1);
    }

    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int len = str.length()-1;
         reverse(str,len);
    }
}
