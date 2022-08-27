/**EXAMPLE OF DO-WHILE LOOP.*/ 

import java.io.*;
public class EXAMPLE_83
{
public static void main(String args[]) throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String str;
System.out.println("Enter lines of text.");
System.out.println("Enter 'stop' to quit.");
do
{
str = br.readLine();
System.out.println(str);
} while(!str.equals("stop"));
}
}


