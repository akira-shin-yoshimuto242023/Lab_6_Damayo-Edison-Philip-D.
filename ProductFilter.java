import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ProductFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        // Add some sample products
        products.add(new Product("Laptop", 1200.00));
        products.add(new Product("Mouse", 25.50));
        products.add(new Product("Keyboard", 60.00));
        products.add(new Product("Monitor", 150.00));
        products.add(new Product("USB Cable", 15.00));

        System.out.print("Enter price threshold: ");
        double threshold = scanner.nextDouble();

        scanner.close();
    }
}
