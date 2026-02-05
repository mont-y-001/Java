class Animal{
    void bark(){
        System.out.println("All animal bark");
    }

    }
    class Dog extends Animal{
        void eat(){
            System.out.println("Animal extended by Dog");
        }

} 
public class Animal2{
    public static void main(String args[]){
        Dog d = new Dog();
        d.bark();
        d.eat();
    }

}
