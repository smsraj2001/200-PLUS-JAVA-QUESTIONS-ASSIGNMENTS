/**Write a program to whether it is toll free number or not.*/

import java.util.*;
public class EXAMPLE_206
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:-");
long num=sc.nextLong();
String S=Long.toString(num);
if(S.length()!=10)
{
System.out.println("Invalid number.Enter a 10 digit number.");
System.exit(0);
}
if(S.startsWith("800")||S.startsWith("888")||S.startsWith("877")||S.startsWith("866"))
System.out.println(num+" is a toll free number.");
else
System.out.println(num+" is not a toll free number.");
}
}