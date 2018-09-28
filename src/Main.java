//Robert Morgan
//R00132949
//SD2-B


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ProductDb database = new ProductDb();
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Customer> CustomerList = new ArrayList();

    public static void main(String[] args) {
        Phone p = new Phone("Apple", "iphone 6", 640, "apple", "6", 65); // all parameters not shown
        Phone p1 = new Phone("Samsung", "Galaxy s6", 500, "samsung", "4", 128);
        Phone p2 = new Phone("Apple", "iphone 4", 500, "apple", "4", 124);
        Phone p3 = new Phone("Samsung", "Galaxy s5", 800, "samsung", "s2", 64);
        TV t=new TV("samsung","high qaulity",1000,"samsung","led",80,true);

        database.add(p1);
        database.add(p);
        database.add(p2);
        database.add(p3);
        database.add(t);
        Customer Mary = new Customer("Mary", "ballinlough");
        CustomerList.add(Mary);
        Order o = new Order();
        o.add(p, 12); // ordered 12 iphone 6 products
        o.add(p1, 1); //ordered 1 Galaxy s6
        Mary.addOrder(o);
        Order o1 = new Order();
        o1.add(p2, 1); // ordered 1 iphone 5 products
        o1.add(p3, 5); //ordered 5 Galaxy s5 products
        Mary.addOrder(o1);
        Customer Joe = new Customer("Joe", "Blackrock");
        CustomerList.add(Joe);

        menu();
    }

    public static void menu() {

        System.out.println("1.Create a New Phone.");
        System.out.println("2.Search Product by ID");
        System.out.println("3.Display all products");
        System.out.println("4.Order Products");
        System.out.println("5.Display all orders");
        System.out.println("6.Quit");


        int choice = 0;
        choice = scanner.nextInt();

        while (choice <= 0) {
            System.out.println("1.Create a New Phone.");
            System.out.println("2.Search Product by ID");
            System.out.println("3.Display all products");
            System.out.println("4.Order Products");
            System.out.println("5.Display all orders");
            System.out.println("6.Quit");
            scanner.nextLine();
            choice=scanner.nextInt();
        }

        switch (choice) {
            case 1:

                createPhone();

                break;
            case 2:
                searchProduct();

                break;
            case 3:
                displayProducts();
                System.out.println();
                menu();

                break;
            case 4:
                orderProduct();
                break;
            case 5:
                displayOrders();
                break;
            case 6:
                Quit();
                break;

            default:
                menu();
                break;

        }
    }

    private static void createPhone() {
        System.out.println("Please Enter the Phone name");
        String name = scanner.next();
        System.out.println("please enter the description");
        String descript = scanner.next();
        System.out.println("Please enter the price");
        double price = scanner.nextDouble();
        System.out.println("Please enter the make");
        String make = scanner.next();
        System.out.println("Please enter the model");
        String model = scanner.next();
        System.out.println("Please enter the storage");
        int storage = scanner.nextInt();
        scanner.nextLine();

        database.add(new Phone(name, descript, price, make, model, storage));
        menu();
    }

    private static void searchProduct() {
        System.out.println("Please enter the Product ID");
        int ID = scanner.nextInt();
        if (ID > database.products.size() - 1) {
            scanner.nextLine();
            System.out.println("Sorry we dont have a product with that ID, try again");
            ID = scanner.nextInt();
        }
        System.out.println(database.find(ID).toString() + "\n");
        menu();
    }

    private static void displayProducts() {
        for (int i = 0; i < database.products.size(); i++) {
            System.out.println(i + ") " + database.products.get(i).toString());

        }


    }
    // order a product
    private static void orderProduct() {
        // display current customers
        int customerNum = 0;
        System.out.println("Please Pick a Customer");
        for (int i = 0; i < CustomerList.size(); i++) {
            System.out.println(i + 1 + ") " + CustomerList.get(i).toString());


        }
        //make a choice and give customernum a value to use later
        int temp = scanner.nextInt();
        customerNum = temp - 1;

        //validation for customer choice
        while ((temp <= 0) || (temp > CustomerList.size())) {
            scanner.nextLine();
            System.out.println("Please enter a valid choice");
            temp = scanner.nextInt();

        }


        int choice = 0;
        Order order = new Order();

        do {
            //repeat menu items
            do {
                System.out.println("1: Order a Product");
                System.out.println("2: Finish Order");
                choice = scanner.nextInt();


            } while ((choice <= 0) || (choice > 2));
            //if choice is one display products and find users input add it to an order and then add the order the customer at customer num
            if (choice == 1) {
                System.out.println("Please choose a Product by ID");
                displayProducts();
                scanner.nextLine();
                int j = scanner.nextInt();
                Product productpicked = database.find(j);


                scanner.nextLine();
                System.out.println("Please pick a qauntitiy");
                j = scanner.nextInt();
                order.add(productpicked, j);
                CustomerList.get(customerNum).addOrder(order);

            }

//if choice is two print out the current orders
            if (choice == 2) {

                System.out.println(CustomerList.get(customerNum).getOrders()+"\n");

            }
        } while (choice != 2);

        menu();
    }

    //print all Customers and orders and return to menu
    private static void displayOrders() {
        for (int i = 0; i < CustomerList.size(); i++) {
            System.out.println(CustomerList.get(i).toString() + "\n" + CustomerList.get(i).getOrders() + "\n");


        }
        menu();
    }

    // quit method
    private static void Quit() {
        System.out.println("Goodbye and Thank You");
    }
}

