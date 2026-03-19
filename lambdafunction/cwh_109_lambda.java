package lambdafunction;

public class cwh_109_lambda {

    interface DemoAno{
        void meth1();
        void meth2();
    }

    static class AnonyDemo implements DemoAno{

        public void display(){
            System.out.println("Hello");
        }

        @Override
        public void meth1(){
            System.out.println("Meth1");
        }

        @Override
        public void meth2(){
            System.out.println("Meth2");
        }
    }

    public static void main(String[] args) {
        AnonyDemo obj = new AnonyDemo();
        obj.meth1();
        obj.meth2();
    }
}