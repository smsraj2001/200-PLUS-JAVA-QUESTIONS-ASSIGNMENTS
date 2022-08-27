/**Write a program to accept various inputs through BufferedReader class.*/

import java.io.*;
public class EXAMPLE_186
{
public static void main(String[]args)throws IOException
{
try
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number of byte datatype:-");
byte n1=Byte.parseByte(br.readLine());
System.out.println("Enter a number of short datatype:-");
short n2=Short.parseShort(br.readLine());
System.out.println("Enter a number of int datatype:-");
int n3=Integer.parseInt(br.readLine());
System.out.println("Enter a number of long datatype:-");
long n4=Long.parseLong(br.readLine());
System.out.println("Enter a number of float datatype:-");
float n5=Float.parseFloat(br.readLine());
System.out.println("Enter a number of double datatype:-");
double n6=Double.parseDouble(br.readLine());
System.out.println("Enter a character:-");
char n7=(char)br.read();
System.out.println("Enter a sentence:-");
String n8=br.readLine();
}
catch(Exception e)
{
System.out.println("Enter a valid element.");
return;
}
finally
{
System.out.println("Operation ended.");
}
}
}