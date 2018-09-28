public class Product {
    private String name;
    private String description;
    private double price;
    private static int productIdCount = 0;
    private int productId = 0;
//Robert Morgan
//R00132949
//SD2-A

    //constructor and also the productId count sets a unique number each time a product is passed through
    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.productId = productIdCount++;

    }
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }

    public void setPrice(double price) {
        this.price = price;
    }




}