package lambdafunction;
import java.util.Comparator;
public class AnonymToLambda {
   public static void main(String[] args) {
    Runnable r = new Runnabel(){
        @Override
        public void run(){
         System.out.println("This is run method anonymus class");
        }
    };
   }
}
