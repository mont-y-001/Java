package area;
class Area{
    int r,l,b;
    Area(String msg){
        System.out.println(msg);
    }
    void getArea(){
        System.out.println("This is area class");
    }
}
class Circle extends Area{
   final double PI=3.14;
   Circle(int r){
    super("This is area Constructor");
     this.r = r;
   }
    void getCircleArea(){
        double result = PI*super.r*this.r;    //super and this?
        System.out.println("Area of Circle is: "+result);

    }
}
public class AreaMain {
    public static void main(String[] args) {
        Circle c = new Circle(4);
        c.getArea();
        c.getCircleArea();
        Area a = new Circle(34);
        a.getArea();

    }
}
