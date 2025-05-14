package Employee;

public class Emp {

    public void display(String name, long empid, String category) {
        System.out.println("Name of employee is: " + name);
        System.out.println("ID of employee is: " + empid);
        System.out.println("Category of employee is: " + category);
    }

    public void calculate(double bpay) {
        double da = 0.05 * bpay;
        double hra = 0.09 * bpay;
        double pf = 0.11 * bpay;
        double allowance = 0.1 * bpay;

        double grosspay = bpay + da + hra + allowance;
        double npay = grosspay - pf;
        double incometax = 0.1 * npay;

        System.out.println("The grosspay is: " + grosspay);
        System.out.println("The net pay is: " + npay);
        System.out.println("The income tax is: " + incometax);
    }
}

