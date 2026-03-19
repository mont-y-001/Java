import java.util.*;

public class ArrList{
  public static void main(String args[]){
    ArrayList<String> list = new ArrayList<>();
    list.add("Mohit");
    list.add("Rohit");
    list.add("Sohit");
    list.add("Mohit");
    
    System.out.println("List:"+list);
    System.out.println("Accessing Index of:"+list.get(1));
    list.set(1, "JavaScript");
    list.add(2,"Yadav");
    System.out.println(list.indexOf("Mohit"));
    System.out.println("Updated List: " + list);
 
  }
}