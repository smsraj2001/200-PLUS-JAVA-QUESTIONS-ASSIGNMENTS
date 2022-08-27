/**Write a pprogram to find largest of two numbers using if...else construct.*/

import java.util.*;
public class EXAMPLE_1
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:-");
int n1=sc.nextInt();
System.out.println("Enter the second number:-");
int n2=sc.nextInt();
if (n1>n2)
System.out.println(n1+ " is greater than " +n2+".");
else
System.out.println(n2+" is greater than "+n1+".");   
}
}
