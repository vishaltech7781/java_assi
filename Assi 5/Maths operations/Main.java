import java.util.*;
import Maths.Ceil;
import Maths.Floor;
import Maths.Round;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the decimal number : ");
        double num = scan.nextDouble();

        Ceil c = new Ceil();
        Floor f = new Floor();
        Round r = new Round();

        System.out.println("Ceil : "+c.applyCeil(num));
        System.out.println("Floor : "+f.applyFloor(num));
        System.out.println("Round : "+r.applyRound(num));
    }
}
