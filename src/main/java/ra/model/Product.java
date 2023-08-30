package ra.model;

public class Product {
    private int id;
    private String nameP;
    private  double price;
    private String description;

    public Product() {
    }

    public Product(int id, String name, double price, String description) {
        this.id = id;
        this.nameP = name;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return nameP;
    }

    public void setName(String name) {
        this.nameP = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
