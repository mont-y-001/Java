class Employers{
          String name;
          int age;

          void display(){
            System.out.println("My name is "+ name + " and my age is " + age);
          }
}
public class Employe{
    public static void main(String args[]){
        Employers e1 = new Employers();
        e1.name = "Mohit Yadav";
        e1.age = 21;

        e1.display();
    }

}