import java.util.ArrayList;

public class Product {
    private final String name;
    private final double price;
    ArrayList<Product> products = new ArrayList<>();

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        products.add(this);
    }

    public double getPrice() {
        return price;
    }

    public void addProduct(String name, double price){
        Product product = new Product(name, price);
        products.add(product);
    }

    public void calculateAverageOfProducts(){
        int i = 0;
        double sum = 0;
        double average = 0;

        for (Product product : products){
            sum += products.get(i++).getPrice();
        }
        average = sum / products.size();
        System.out.println("The average of the products is : " + String.format("%.2f", average));
    }
}
