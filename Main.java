 class Human{
     void display(){
        System.out.println("Hii");
     }
}

class Student extends Human{
    void merge(){
        System.out.println("Student");
    }
}
class Employee extends Human{
    void show(){
        System.out.println("Employee Class");
    }
}

public class Main{
public static void main(String args[]){
    Employee s1 = new Employee();
    s1.show();
    s1.display();
    Student e1 = new Student();
    e1.merge();
    e1.display();

}
}