import Library.Book;
import Library.Member;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Book b = new Book();
        Member m = new Member();
        
        System.out.println("Name of book : ");
        String title = scan.nextLine();

        System.out.print("Name of author : ");
        String author = scan.nextLine();

        System.out.println("Book no : ");
        int ISBN = scan.nextInt();
        scan.nextLine();
        Book ob1 = new Book();

        ob1.setinfo(title, author, ISBN);

        System.out.println("Enter name of member : ");
        String name = scan.nextLine();

        System.out.println("Enter the ID of member : ");
        int id = scan.nextInt();

        Member ob2 = new Member();
        ob2.setinfo(name, id);

        System.out.println("Entered details are : ");
        ob1.getinfo();
        ob2.getinfo();
        
        

    }
}
