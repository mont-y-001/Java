//[1]No. of parameter
//[2]Different datatype
//[3]change in order of parameter
class Product {

 // Multiplying two integer values
 public int multiply(int a, int b){
 return a * b;
 }
 // Multiplying three integer values
 public double multiply(double a, int b, int c){
 return a * b * c;
 }
}
class Method_Overloading {
 public static void main(String[] args){

 Product ob = new Product();
 int prod1 = ob.multiply(1, 2);
 System.out.println("Product of the two integer value: " + prod1);
 double prod2 = ob.multiply(1.0, 2, 3);
 System.out.println("Product of the three integer value: " + prod2);
 System.out.println(ob.multiply(3,4,2));
 }
}