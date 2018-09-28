//Robert Morgan
//R00132949
//SD2-A
// Tv is a sub of product and we use this so tv's can be added to the product database
public class TV extends Product {
    //attributes
    String make;
    String type;
    int screenSize;
    boolean capable;


    public TV(String name, String description, double price, String make, String type, int screenSize, boolean capable) {
        super(name, description, price);
        this.make = make;
        this.type = type;
        this.screenSize = screenSize;
        this.capable = capable;
    }
    //getters and setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isCapable() {
        return capable;
    }

    public void setCapable(boolean capable) {
        this.capable = capable;
    }

    @Override
    public String toString() {
        return "TV{" +
                "make: '" + make + '\'' +
                ", type: '" + type + '\'' +
                ", screenSize: " + screenSize +
                " Inches, 3D capable=" + capable +
                ", description: "+getDescription()+
                ", price: €"+ getPrice()+
                '}';
    }

    public void print(){
        System.out.println(toString());
    }
}
