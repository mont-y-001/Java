import java.lang.Thread;
class A extends Thread{
   public void run(){
        for(int i = 0;i<5;i++){
            System.out.println("A:"+i);
        }

    }
}
class B extends Thread{
   public void run(){
        for(int i = 0;i<5;i++){
            System.out.println("B:"+i);
        }

    }
}
public class TestThread{
    public static void main(String args[]){
        new B().start();
        new A().start();
    }
}
