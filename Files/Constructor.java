class Student {
    String name;
    int age;
    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }
    // Copy Constructor
    Student(Student s) {
        name = s.name;
        age = s.age;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
 }public  class Constructor{
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 20); // normal object
        Student s2 = new Student(s1);          // copy constructor
        s1.display();
        s2.display();
    }
 }