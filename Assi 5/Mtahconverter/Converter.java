package math.convert;

public class Converter {

    // Convert integer to binary string
    public String toBinary(int n) {
        return Integer.toBinaryString(n);
    }

    // Convert integer to octal string
    public String toOctal(int n) {
        return Integer.toOctalString(n);
    }

    // Convert integer to hexadecimal string
    public String toHex(int n) {
        return Integer.toHexString(n);
    }

    // Convert binary string to integer
    public int fromBinary(String binary) {
        return Integer.parseInt(binary, 2);
    }

    // Convert octal string to integer
    public int fromOctal(String octal) {
        return Integer.parseInt(octal, 8);
    }

    // Convert hexadecimal string to integer
    public int fromHex(String hex) {
        return Integer.parseInt(hex, 16);
    }
}

