//TCP client

import java.util.*;
import java.net.*;
import java.io.*;

class tcpclient
{
public static void main(String args[])
{
try
{
Socket s1 = new Socket("localhost", 1520);

DataInputStream dis;
DataOutputStream dos;
InputStream is;
OutputStream os;

is = s1.getInputStream();
os = s1.getOutputStream();
dis = new DataInputStream(is);
dos = new DataOutputStream(os);

Scanner sc = new Scanner(System.in);
int str;
do
{

System.out.println("enter the number :");
str = sc.nextInt();
System.out.println("Data is send");
str = sc.nextInt();
dos.writeInt(str);
System.out.println("Data Received:");
str = dis.readInt();
System.out.println(str);
}while(!str.equals("STOP"));
}
catch(Exception e)
{ }
}
}



