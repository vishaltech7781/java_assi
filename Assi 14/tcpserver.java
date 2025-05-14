//TCP Server
import java.util.*;
import java.net.*;
import java.io.*;

class tcpserver
{

factorial(str){
  
for (int i = 1;i<=n;i++){
	    fact = fact*i;
	    
	  }
	  System.out.println("factorial is :"+fact );
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

String str;
do
{

System.out.println("Data Received:");
str = dis.readInt();
System.out.println(str);
factorial(str);
System.out.println("Data is send:");
str = sc.nextLine();
dos.writeint(str);
}while(!str. equals("STOP"));

}
catch(Exception e)
{
}
}
}
