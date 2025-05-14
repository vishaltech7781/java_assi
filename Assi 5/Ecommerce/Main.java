import ecommerce.Product;
import ecommerce.Customer;
import ecommerce.Order;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Product name : ");
        String pname = scan.nextLine();

        System.out.println("Enter Product id : ");
        int pid = scan.nextInt();
        scan.nextLine();

        Product p = new Product();
        p.setinfo(pname, pid);

        System.out.println("Enter Customer name : ");
        String cname = scan.nextLine();

        System.out.println("Enter Customer id : ");
        int cid = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter Customer address : ");
        String address = scan.nextLine();

        Customer c = new Customer();
        c.setinfo(cname, cid, address);

        System.out.println("Enter the cost : ");
        int cost = scan.nextInt();

        System.out.println("Enter gst int % : ");
        int gst = scan.nextInt();

        Order o = new Order();
        o.setinfo(cost, gst);
        
        System.out.println("Entered details are : ");
        p.getinfo();
        c.getinfo();
        o.getinfo();


    }
}
