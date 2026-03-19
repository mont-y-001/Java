package Abstraction;

abstract class MainArea {
    abstract void getArea();

}

class Rectangle extends MainArea{
    int l,b;
    Rectangle(int l,int b){
        this.l = l;
        this.b = b;
    }
    @Override
    void getArea(){
        int r = l*b;
        System.out.println(r);
    }
    void displayResult(){
        System.out.println("This is dispaly function in Rectangle");
    }

}
public class Area {
    public static void main(String[] args) {
        System.out.println("Hello");
       Rectangle r1 = new Rectangle(3,6);
       r1.getArea();
       r1.displayResult();
       MainArea r2 = new Rectangle(32,2);
       r2.getArea();
       MainArea circle = new MainArea(){
           int r = 5;
           @Override
           void getArea(){
            double result = 3.14*r*r;
            System.out.println("Area of circle" + result);
           };
       };
       circle.getArea();



    }

}
