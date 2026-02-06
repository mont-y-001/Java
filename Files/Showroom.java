class Car{
    String model;
    String company;
    int price;

    void display(){
        System.out.println("Bough a new Car "+ model + " of Company " + company + " at price " + price);
    }

}
public class Showroom{
    public static void main(String args[]){
        Car obj = new Car();
        obj.model = "Porsche";
        obj.company= "Lambo";
        obj.price = 500000;

        obj.display(); 
    }
}