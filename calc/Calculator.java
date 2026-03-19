package calc;

class Calculator1{
    int n1,n2;
   
    void sum(){
        System.out.println("sum is: "+(n1+n2));
    }
}
public class Calculator {
    public static void main(String[] args) {
        Calculator1 s1=new Calculator1();
        s1.sum();
    }
}
