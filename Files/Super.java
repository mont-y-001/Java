class Animal{
    String color = "White";
    void eat(){
        System.out.println("Animal Class");
    }
}
class Dog extends Animal{
    String color = "Black";

    void printColor(){
           System.out.println("Animal color "+super.color);
           System.out.println("Dog color "+color);    
    }
    void eat(){
        super.eat();
        System.out.println("Dog eats bread");
    }
} 

public class Super{
    public static void main(){
        Dog obj = new Dog();
        obj.printColor();
        obj.eat(); 
    }
}