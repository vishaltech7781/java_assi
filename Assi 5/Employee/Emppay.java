import Employee.Emp;
import java.util.*;

public class Emppay {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name of Employee: ");
        String name = sc.nextLine();

        System.out.println("Enter ID of Employee: ");
        long empid = sc.nextLong();
        sc.nextLine();  // Consume newline

        System.out.println("Enter category of Employee: ");
        String category = sc.nextLine();

        System.out.println("Enter basic pay of Employee: ");
        double bpay = sc.nextDouble();

        Emp e = new Emp();  // Corrected class instantiation
        e.calculate(bpay);
        e.display(name, empid, category);
    }
}

