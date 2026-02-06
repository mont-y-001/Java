class MyDog{
    String breed;
    String color;
    int age;

    public void setBreed(String breed){
        this.breed = breed;
    }
    public void setColor(String color){
        this.color= color;
    }
    public void setAge(int age){
        this.age= age;
    }

    void display(){
        System.out.println("Breed name: "+ breed);
        System.out.println("His Age: "+ age);
        System.out.println("color: "+ color);
    }

}
public class Dog{
    public static void main(String args[]){
        MyDog obj = new MyDog();

        obj.setBreed("Labra");
        obj.setColor("Black-White");
        obj.setAge(20);

        obj.display();

        
    }

}