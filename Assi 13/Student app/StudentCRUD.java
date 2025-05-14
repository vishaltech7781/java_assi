import java.sql.*;
import java.util.Scanner;

public class StudentCRUD {
    static final String DB_URL = "jdbc:mysql://localhost:3306/student_db";
    static final String USER = "root";         // Change if needed
    static final String PASS = "your_password"; // Change if needed

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connected to database!");

            while (true) {
                System.out.println("\n===== Student Menu =====");
                System.out.println("1. Insert Student");
                System.out.println("2. View All Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        insertStudent(conn, sc);
                        break;
                    case 2:
                        viewStudents(conn);
                        break;
                    case 3:
                        updateStudent(conn, sc);
                        break;
                    case 4:
                        deleteStudent(conn, sc);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void insertStudent(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        String query = "INSERT INTO student VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.setInt(3, age);
        pstmt.setString(4, course);

        int rows = pstmt.executeUpdate();
        System.out.println(rows + " student inserted.");
    }

    static void viewStudents(Connection conn) throws SQLException {
        String query = "SELECT * FROM student";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        System.out.println("\nID\tName\tAge\tCourse");
        System.out.println("-------------------------------");
        while (rs.next()) {
            System.out.println(rs.getInt("id") + "\t" +
                               rs.getString("name") + "\t" +
                               rs.getInt("age") + "\t" +
                               rs.getString("course"));
        }
    }

    static void updateStudent(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter ID of student to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new name: ");
        String name = sc.nextLine();
        System.out.print("Enter new age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new course: ");
        String course = sc.nextLine();

        String query = "UPDATE student SET name=?, age=?, course=? WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, name);
        pstmt.setInt(2, age);
        pstmt.setString(3, course);
        pstmt.setInt(4, id);

        int rows = pstmt.executeUpdate();
        System.out.println(rows + " student updated.");
    }

    static void deleteStudent(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter ID of student to delete: ");
        int id = sc.nextInt();

        String query = "DELETE FROM student WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setInt(1, id);

        int rows = pstmt.executeUpdate();
        System.out.println(rows + " student deleted.");
    }
}
