import java.util.*;
interface Shape{
    public double area();
}
class rect implements Shape{
double dim1;
double dim2;

public rect(double height, double width) {
        dim1 = height;
        dim2 = width;
    }
    @Override
    public double area(){
        return dim1*dim2;
    }
}

class tri implements Shape{
double dim1,dim2;

  public tri(double height ,double base){
        dim1=height;
        dim2=base;
  }
  @Override 
  public double area(){
      return 0.5*dim1*dim2;
  }
}
class Interfacearea{
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
       
       System.out.println("Enter dimensions for Rectangle:");
        System.out.print("Length: ");
        double length = scan.nextDouble();
        System.out.print("Width: ");
        double width = scan.nextDouble();
        rect rectangle = new rect(length, width);

        System.out.println("\nEnter dimensions for Triangle:");
        System.out.print("Base: ");
        double base = scan.nextDouble();
        System.out.print("Height: ");
        double height = scan.nextDouble();
        tri triangle = new tri(height, base);
        
        System.out.println("\nArea of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());

        scan.close();
   

    }
}

