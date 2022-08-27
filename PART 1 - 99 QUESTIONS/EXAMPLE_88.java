/**Write a program to find the ASCII value of a character:-*/

import java.io.*;
public class EXAMPLE_88
{
public static void main(String[]args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a character:-");
char ch=(char)br.read();
int x=ch;
System.out.println("The ASCII value of "+ch+" is "+x+".");
}
}