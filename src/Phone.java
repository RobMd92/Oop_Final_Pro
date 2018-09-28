//Robert Morgan
//R00132949
//SD2-A

//phone is also a sub of product and much like tv we use this to add phones to the product database
public class Phone extends Product {
    //attributes
    private String make;
    private String model;
    private int storage;

    public Phone(String name, String description, double price, String make, String model, int storage) {
        super(name, description, price);
        this.make = make;
        this.model = model;
        this.storage = storage;
    }
    //getters and setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "make: '" + make + '\'' +
                ", model: '" + model + '\'' +
                ", storage=" + storage +
                ", description: "+getDescription()+
                ", price : €"+getPrice()+
                '}';
    }

    public void print(){
        System.out.println(toString());
    }
}