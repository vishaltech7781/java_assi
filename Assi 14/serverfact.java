import java.io.*;
import java.net.*;
import java.util.*;

class serverfact
{

public static int factorial(int n){
    if(n == 0 || n == 1) return 1;

    return n*factorial(n-1);

}

public static void main(String args[])
{
try
{
ServerSocket s1 = new ServerSocket(1520);
Socket s2 = s1.accept();

DataInputStream dis;
DataOutputStream dos;

InputStream is;
OutputStream os;

is = s2.getInputStream();
os = s2.getOutputStream();

dis = new DataInputStream(is);
dos = new DataOutputStream(os);

Scanner sc = new Scanner(System.in);

int num = dis.readInt();
System.out.println("number recived from client for converting:" + num);

int result = factorial(num);
System.out.println("Data is send:" + result);

dos.writeInt(result);


}
catch(Exception e){

}

}

}
