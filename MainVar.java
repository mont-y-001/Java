class Message{
   void getMessage(){
    System.out.println("Done");
   }
}
public class MainVar {
    public static void main(String[] args) {
        var m = new Message();
        m.getMessage();
        var r = "Java10";
        var n1 = 10.50;
        var n2 = 20;
        System.out.println("Sum: "+(n1+n2));
    }
}
