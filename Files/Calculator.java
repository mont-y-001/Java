class Calci{
    int a;
    int b;

    int add(int a,int b){
       return a+b;
    }

    int multiply(int a,int b){
        return a*b;
    }
}
public class Calculator{
    public static void main(String args[]){
        Calci c1 = new Calci();
        Calci c2 = new Calci();
        
        int sum = c1.add(5, 6);
        int product = c2.multiply(5, 9);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}