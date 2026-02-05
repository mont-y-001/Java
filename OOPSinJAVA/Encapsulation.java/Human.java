class Human1 {
    private int age;
    private String name = "Mohit";

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class Human {
    public static void main(String args[]) {
        Human1 obj = new Human1();

        obj.setName("MOHIT Yadav");

        System.out.println("name : " + obj.getName());
    }
}
