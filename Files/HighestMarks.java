import java.util.Scanner;
public class HighestMarks {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. to compare");
        int num = sc.nextInt();

        int marks[] = new int[num];

        for(int i = 0;i<num;i++){
             marks[i] = sc.nextInt();
        }

        int highest = marks[0];

        for(int i = 0;i<num;i++){
            if(marks[i]>=highest){
                highest = marks[i]; 
            }
        } 
        System.out.println("Highest is "+highest);
    }
}