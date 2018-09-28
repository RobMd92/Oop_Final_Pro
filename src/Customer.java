//Robert Morgan
//R00132949
//SD2-A
import java.util.ArrayList;

 class Customer {
    //attributes
    private String name;
    private String address;
    private ArrayList <Order>orders=new ArrayList<>();

    //constructor
     Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //add orders to the array list
     boolean addOrder(Order order){
        return   orders.add(order);

    }

    //get orders so we can use it to display them
     ArrayList<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return name+" "+address;
    }

    public void print (){
        System.out.println(toString());
    }
}