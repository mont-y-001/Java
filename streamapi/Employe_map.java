package streamapi;
import java.util.*;
class Employee{
    int Roll_no;
    String Name;
    String Department;
}
public class Employe_map {
    public static void main(String[] args) {
        
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(1,"Ankit","CSE"));
        list.add(new Employee(2,"Rahul","MCA"));
        System.out.println(list);
    }
}
