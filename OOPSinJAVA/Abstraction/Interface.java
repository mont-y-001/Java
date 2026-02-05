interface Animal {
 void sound(); // abstract method
 void eat(); // abstract method
}
class Dog implements Animal {
 public void sound() {
 System.out.println("Dog barks");
 }
 public void eat() {
 System.out.println("Dog eats bones");
 }
}
public class Interface {
 public static void main(String[] args) {
 Animal a = new Dog(); // Upcasting
 a.sound();
 a.eat();
 }
}