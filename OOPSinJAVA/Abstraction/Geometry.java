abstract class Shape {
 int sides;
 Shape(int sides) {
 this.sides = sides;
 System.out.println("Shape constructor: " + sides + " sides");
 }
 abstract void area();
}
class Rectangle extends Shape {
 int length, breadth;
 Rectangle(int l, int b) {
 super(4); // calling abstract class constructor
 this.length = l;
 this.breadth = b;
 }
 void area() {
 System.out.println("Area = " + (length * breadth));
 }
}
public class Geometry {
 public static void main(String[] args) {
 Rectangle r = new Rectangle(5, 3);
 r.area();
 }
}