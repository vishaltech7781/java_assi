package math;

public class MathOper {

    // Method to calculate factorial of a number
    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method to calculate cube of a number
    public int cube(int n) {
        return n * n * n;
    }
}

