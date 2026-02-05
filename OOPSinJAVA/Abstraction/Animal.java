abstract class Animal1{
    //Abstract Method
    abstract void sound();
    abstract void bark();

    //Non abstract method(with body)
    void eat(){
        System.out.println("This animal eats");
    }
}
abstract class Dog extends Animal1{
    
    void sound(){
        System.out.println("Dog barks");
    }
}
class Kutta extends Dog{
     void bark(){
         System.out.println("This dog barks");
     }
}
public class Animal{
    public static void main(String args[]){
        Animal1 obj = new Kutta();
        obj.sound();
        obj.eat();
        obj.bark();

    } 
}