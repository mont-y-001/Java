package dsa;

class Student{
    int id;
    String name;

void display(){
    System.out.println(id + " " + name);
}
}
public class class_object {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Mohit Yadav";
        s1.id = 1;
        s1.display();
        s1.name = "Mohit Yadav";
        s1.id = 1;
        s1.display();

    }
}
