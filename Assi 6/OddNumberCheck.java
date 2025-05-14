import java.util.Scanner;

public class OddNumberCheck {

    // Custom Exception Class
    static class OddNumberException extends Exception {
        public OddNumberException(String message) {
            super(message);
        }
    }

    // Method that throws exception if number is odd
    public static void checkEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("OddNumberException: The number " + number + " is odd.");
        } else {
            System.out.println("The number " + number + " is even.");
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        try {
            checkEven(num);
        } catch (OddNumberException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        sc.close();
    }
}
