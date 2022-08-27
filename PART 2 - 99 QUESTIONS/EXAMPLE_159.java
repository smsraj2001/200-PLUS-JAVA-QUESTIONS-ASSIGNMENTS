/**Scanner class functions.*/

import java.util.*;
public class EXAMPLE_159
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:-");
while(sc.hasNextInt())
{
sc.next();
System.out.println("Enter a valid name.");
}
String name=sc.next();
System.out.println("The string is "+name+".");
}
}