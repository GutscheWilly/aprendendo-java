package entities;

public class Product implements Comparable<Product> {
    
    private String name;
    private Double price;
    
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s, R$ %.2f", name, price);
    }

    @Override
    public int compareTo(Product other) {
        return price.compareTo(other.getPrice());
    }
}
