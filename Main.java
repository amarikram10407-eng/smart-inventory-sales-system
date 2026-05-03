import java.time.*;
import java.util.*;
class Product {
    private double price;
    private int stockQuantity;
    int productID;
    String productName;
    String category;
    String status;
    public Product(int id, String name, String category, double price, int stock) {
        this.productID = id;
        this.productName = name;
        this.category = category;
        setPrice(price);
        setStockQuantity(stock);
    }
    // Encapsulation:
    public double getPrice() { return price; }
    public void setPrice(double value) {
        if (value < 0) throw new IllegalArgumentException("Price cannot be negative");
        price = value;
    }
    public int getStockQuantity() { return stockQuantity; }
    public void setStockQuantity(int value) {
        if (value < 0) throw new IllegalArgumentException("Stock cannot be negative");
        stockQuantity = value;
        status = (value == 0)? "Out of Stock" : "Available";
    }
    public String toString() {
        return "[" + productID + "] " + productName +
               " " + category +
               " PKR " + price +
               " Stock: " + stockQuantity +
               " " + status;
    }
}
public class Main {
    public static void main(String[] args) {
        // 3 products create kiye
        Product p1 = new Product(1, "Lawn Suit", "Casual", 4500, 30);
        Product p2 = new Product(2, "RayBan Sunglasses", "Accessories", 8500, 15);
        Product p3 = new Product(3, "Blue Light Glasses", "Eyewear", 2500, 0);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}