package ecommerce;

public  class Product{
    public String name;
    public int id;

    public void setinfo(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void getinfo(){
        System.out.println("Product name is : "+name);
        System.out.println("Product id is : "+id);
    }
}