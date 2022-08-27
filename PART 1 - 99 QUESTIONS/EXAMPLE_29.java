/**Write a program to accept three numbers by the user and print the smallest number.*/

import java.util.*;
public class EXAMPLE_29
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter three numbers:-");
System.out.println("Enter the first number:-");
int n1=sc.nextInt();
System.out.println("Enter the second number:-");
int n2=sc.nextInt();
System.out.println("Enter the third number:-");
int n3=sc.nextInt();
int min;
if(n1<n2)
{
if(n1<n3)
min=n1;
else
min=n3;
}
else
{
if(n2<n3)
min=n2;
else
min=n3;
}
System.out.println(min+" is the smallest of the given three numbers.");
}
}
