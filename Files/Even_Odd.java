import java.util.Scanner;
public class Even_Odd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number to Check: ");
        int Number = sc.nextInt();

    if(Number%2 == 0){
        System.out.println("Given Number is Even");
    }else{
        System.out.println("Given Number is Odd");

    }

    }
}
