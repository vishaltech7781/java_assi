import java.io.*;
import java.util.Scanner;

public class FileExists {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the file name.");
            return;
        }

        String file_name = args[0];
        File file = new File(file_name);
        Scanner scanner = new Scanner(System.in);

        try {
            if (file.exists()) {
                System.out.println("File exists. Displaying contents:\n");

                // Display the file content
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();

                // Ask if user wants to append data to the file
                System.out.print("\nDo you want to add data to the end of the file? (yes/no): ");
                String response = scanner.nextLine();

                if (response.equalsIgnoreCase("yes")) {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
                    System.out.println("Enter data to append (type 'exit' to finish):");
                    while (true) {
                        String inp = scanner.nextLine();
                        if (inp.equalsIgnoreCase("exit"))
                            break;
                        bw.write(inp);
                        bw.newLine();
                    }
                    bw.close();
                    System.out.println("Data appended successfully.");
                }
            } else {
                System.out.println("File doesn't exist. Creating new file: " + file_name);

                // Create a new file and write data
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                System.out.println("Enter data to write (type 'exit' to finish):");
                while (true) {
                    String inp = scanner.nextLine();
                    if (inp.equalsIgnoreCase("exit"))
                        break;
                    bw.write(inp);
                    bw.newLine();
                }
                bw.close();
                System.out.println("Data written successfully.");
            }
        } catch (IOException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
	
