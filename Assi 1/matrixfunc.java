import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first 2x2 matrix
        int[][] matrix1 = new int[2][2];
        System.out.println("Enter elements of the first 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Read second 2x2 matrix
        int[][] matrix2 = new int[2][2];
        System.out.println("Enter elements of the second 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Menu for operations
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Transpose of the first matrix");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                int[][] sum = new int[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        sum[i][j] = matrix1[i][j] + matrix2[i][j];
                    }
                }
                System.out.println("Result of Addition:");
                printMatrix(sum);
                break;

            case 2:
                int[][] product = new int[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        product[i][j] = matrix1[i][0] * matrix2[0][j] + matrix1[i][1] * matrix2[1][j];
                    }
                }
                System.out.println("Result of Multiplication:");
                printMatrix(product);
                break;

            case 3:
                int[][] transpose = new int[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        transpose[i][j] = matrix1[j][i];
                    }
                }
                System.out.println("Transpose of the first matrix:");
                printMatrix(transpose);
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

