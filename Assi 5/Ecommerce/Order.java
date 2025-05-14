package ecommerce;

public class Order {
    public int cost;
    public int gst;
    public int total;
    
    
    public void setinfo(int cost, int gst){
        this.cost = cost;
        this.gst= gst;
        int gsttotal = gstcost(gst, cost);
        this.total = cost + gsttotal;
    }

    public int gstcost(int gst, int cost){
        return (gst * cost) / 100;

    }

    public void getinfo(){
        System.out.println("Cost of product : "+cost);
        System.out.println("GST applied in % : "+gst);
        System.out.println("Total cost : "+total);
    }
}
