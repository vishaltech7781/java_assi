import java.util.*;
import math.MathOper;
import math.convert.Converter;

public class MainDemo {

    public static void main(String[] args) {

        MathOper op = new MathOper(); // corrected class name and instantiation
        Converter c = new Converter();

        int num = 5;

        System.out.println("Factorial of 5: " + op.factorial(num));
        System.out.println("Cube of 5: " + op.cube(num));

        System.out.println("Binary: " + c.toBinary(num));
        System.out.println("Octal: " + c.toOctal(num));
        System.out.println("Hex: " + c.toHex(num));

        // Valid binary (e.g., "1101" is 13)
        System.out.println("Binary '1101' to Decimal: " + c.fromBinary("1101"));

        // Valid octal (e.g., "10" is 8 in decimal)
        System.out.println("Octal '10' to Decimal: " + c.fromOctal("10"));

        // Valid hex (e.g., "A" is 10 in decimal)
        System.out.println("Hex 'A' to Decimal: " + c.fromHex("A"));
    }
}

