package Polymorphism;

class Animal {
    String name;
    String sound;
    void makeSound(){
      System.out.println("This is Animal Class");
    } 
    void display(){
      System.out.println("This sis");
    }  
  }
  
  class Cat extends Animal{
    int legs;
Cat(String name,String sound,int legs){
  super.name = name;
  super.sound = sound;
  this.legs = legs;
  @Override
}
    
}

public class Mainpoly{
  public static void main(String[] args) {
            
  }
}
