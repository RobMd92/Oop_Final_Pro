//Robert Morgan
//R00132949
//SD2-A
import java.util.ArrayList;

public class ProductDb {
    ArrayList <Product> products = new ArrayList();

    //empty constructor to pass in the created products
    public ProductDb() {

    }
    // add fuction for adding to the array list
    public boolean add(Product product){
        return products.add(product);

    }
    // remove function for removing products from the array list
    public boolean remove(Product product){
        return  products.remove(product);
    }

    //find funtion
    //using an id passed in from a user we traverse through the array and if it matches we return that product
    public Product find(int productId){
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getProductId()==productId){
                return products.get(i);
            }
        }


        return null;
    }

}
