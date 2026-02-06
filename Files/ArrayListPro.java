import java.util.ArrayList;
 public class ArrayListPro{
    public static void main(String args[]){
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);

        for(int num : number){
            System.out.println(num);
        }
    }
 }