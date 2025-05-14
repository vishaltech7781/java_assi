import java.io.*;
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "student_info.dat";

        System.out.println("Enter Student Details");

        System.out.print("Student name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Weight (in kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Height (in cm): ");
        int height = scanner.nextInt();

        scanner.nextLine(); // Consume newline

        System.out.print("City: ");
        String city = scanner.nextLine();

        System.out.print("Phone number: ");
        String ph_no = scanner.nextLine();

        // Write to file
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename));
            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeDouble(weight);
            dos.writeInt(height);
            dos.writeUTF(city);
            dos.writeUTF(ph_no);
            System.out.println("\nData written successfully to " + filename);
            dos.close();
        } catch (IOException e) {
            System.out.println("Caught Exception while writing: " + e.getMessage());
        }

        // Read from file
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(filename));
            System.out.println("\n--- Retrieved Student Details ---");
            System.out.println("Name   : " + dis.readUTF());
            System.out.println("Age    : " + dis.readInt());
            System.out.println("Weight : " + dis.readDouble() + " kg");
            System.out.println("Height : " + dis.readInt() + " cm");
            System.out.println("City   : " + dis.readUTF());
            System.out.println("Phone  : " + dis.readUTF());
            dis.close();
        } catch (IOException e) {
            System.out.println("Caught Exception while reading: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

