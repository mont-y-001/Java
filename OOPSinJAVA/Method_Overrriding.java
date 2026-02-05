class A{
        public int a;
    public void meth2(){
        System.out.println("Its is method 2 of A");
    }
    public int mohit(){
       return 5;
       
    }
}
    class B extends A{
        public void meth2(){
            System.out.println("Its is method 2 of B");

        }
    }
public class Method_Overrriding{
    public static void main(String[] args){
    A a = new A();
    a.meth2();

    B b = new B();
    b.meth2();
    }
}