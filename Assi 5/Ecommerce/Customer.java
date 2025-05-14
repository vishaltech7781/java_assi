package ecommerce;

public class Customer {
    public String name;
    public int id;
    public String address;


    public void setinfo(String name, int id, String address){
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public void getinfo(){
        System.out.println("Customer name : "+name);
        System.out.println("Customer id : "+id);
        System.out.println("Customer address : "+address);
    }
}
