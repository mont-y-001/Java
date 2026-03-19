public class Car{

    String brand;
    int price;

    void display(){
        System.out.println("I have bought a new " + brand + " Car");
        System.out.println("it's price is " + price + "k");

    }
    public static void main(String args[]){
        Car c1 = new Car();
        c1.brand="Porsche";
        c1.price=50;

        c1.display();
    }
}