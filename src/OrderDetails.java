//Robert Morgan
//R00132949
//SD2-A
class OrderDetails {
    //attributes
    private Product product;
    private int quantity;

    //constructor for a product and its qauntity when we are ordering
     OrderDetails(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    //getters and setters
     Product getProduct() {
        return product;
    }

     void setProduct(Product product) {
        this.product = product;
    }

     int getQuantity() {
        return quantity;
    }

     void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return
                "\nproduct: " + product +
                        ", quantity=" + quantity ;
    }
}
