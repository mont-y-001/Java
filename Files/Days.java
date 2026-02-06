import java.util.Scanner;

public class Days{
         public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Total Days: ");
            int Total_Days = sc.nextInt();

            System.out.println("Total Number of Year: " + Total_Days/365);
            System.out.println("Total Number of Week: " + (Total_Days%365)/7);
            System.out.println("Total Number of Days: " + ((Total_Days%365)%7));

            sc.close();



         }
}