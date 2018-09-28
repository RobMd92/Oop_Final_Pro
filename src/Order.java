//Robert Morgan
//R00132949
//SD2-A
import java.util.ArrayList;

public class Order {
    //attributes

    ArrayList<OrderDetails>orderDetails=new ArrayList<>();

    public boolean add(Product product, int quantity){
        return  orderDetails.add(new OrderDetails(product,quantity));
    }

    @Override
    public String toString() {
        return
                "\n Order Details \n"+orderDetails ;
    }

    public void print(){
        System.out.println(toString());
    }
}