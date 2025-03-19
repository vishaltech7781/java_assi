import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Sorted numbers in ascending order:");
        System.out.println(Arrays.toString(numbers));
    }
}

