/**Write a program to find the maximum of two numbers using the if...else construct.*/

import java.util.*;
public class EXAMPLE_4
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:-");
int n1=sc.nextInt();
System.out.println("Enter the second number:-");
int n2=sc.nextInt();
if(n1>n2)
System.out.println(n1+" is greater than "+n2+".");
else if(n2>n1)
System.out.println(n2+" is greater than "+n1+".");
else
System.out.println("They both are equal to each other.");
}
}        