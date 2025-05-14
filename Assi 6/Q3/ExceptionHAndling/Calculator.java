package ExceptionHandlingDemo;

public class Calculator {

    public int divide(int a, int b) throws DivisionException {
        if (b == 0) {
            throw new DivisionException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public int add(int a, int b){
        return a + b;
    }

    public int sub(int a, int b){
        return a - b;
    }

    public int multi(int a, int b){
        return a*b;
    }

    
}
