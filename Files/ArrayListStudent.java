import java.util.ArrayList;

class Student {
    String name;
    int age;
    String grade;


    Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
        System.out.println("Grade: " + grade);
        System.out.println("--------------------");
    }
}

public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        
        students.add(new Student("Amit", 18, "A"));
        students.add(new Student("Riya", 17, "B"));
        students.add(new Student("Sohan", 19, "A+"));
        students.add(new Student("Neha", 18, "A"));
        students.add(new Student("Rahul", 17, "B+"));

        // Display student details
        System.out.println("Student Details:");
        for (Student s : students) {
            s.display();
        }
    }
}