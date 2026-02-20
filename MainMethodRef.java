class Circle{
    double area(int r){
        return Math.PI*r*r;
    }
}

interface Area{
    double getArea(int num);
}

public class MainMethodRef{

    public static void main(String args[]){

        Circle c = new Circle();

        Area ca = c::area;

        System.out.println("Area = " + ca.getArea(34));
    }
}
