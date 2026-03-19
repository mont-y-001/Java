import java.util.ArrayList;

class Product {
    private int pid;
    private String productName;
    private double price;
    private int quantity;

    public Product(int pid, double price, String productName, int quantity) {
        this.pid = pid;
        this.price = price;
        this.productName = productName;
        this.quantity = quantity;
    }

    public int getPid() {
        return pid;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

public class MainEnc {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(101, 20000, "Mobile", 10));
        products.add(new Product(102, 1000, "Fan", 15));
        products.add(new Product(103, 7000, "RAM", 8));
        products.add(new Product(104, 1500, "Earphone", 20));
        products.add(new Product(105, 70000, "Laptop", 5));

        for (Product p : products) {
            System.out.println("Product ID: " + p.getPid());
            System.out.println("Name: " + p.getProductName());
            System.out.println("Price: " + p.getPrice());
            System.out.println("Quantity: " + p.getQuantity());
            System.out.println("------------------------");
        }
    }
}
