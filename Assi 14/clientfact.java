import java.io.*;
import java.net.*;
import java.util.*;

class clientfact {

    public static void main(String args[]) {
        try {
            Socket s1 = new Socket("10.1.94.240", 1520);

            DataInputStream dis;
            DataOutputStream dos;
            InputStream is;
            OutputStream os;

            is = s1.getInputStream();
            os = s1.getOutputStream();
            dis = new DataInputStream(is);
            dos = new DataOutputStream(os);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a number to convert into factorial : ");
            int num = sc.nextInt();

            dos.writeInt(num);
            System.out.println("Number sent to server");

            int result = dis.readInt();
            System.out.println("Number received is : "+result);
        } catch (Exception e) {
        }
    }
}
