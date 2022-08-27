/**Write a program to accept four numbers and print the largest number.*/

import java.util.*;
public class EXAMPLE_36
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter four numbers:-");
System.out.println("Enter the first number:-");
int n1=sc.nextInt();
System.out.println("Enter the second number:-");
int n2=sc.nextInt();
System.out.println("Enter the third number:-");
int n3=sc.nextInt();
System.out.println("Enter the fourth number:-");
int n4=sc.nextInt();
int large;
if(n1>n2)
{
if(n1>n3)
{
if(n1>n4)
{
large=n1;
}
else
large=n4;
large=n3;
}
large=n2;
}
else
{
if(n3>n4)
large=n3;
else 
large=n4;
}
if(n2>n3)
{
if(n2>n4)
large=n2;
else
large=n4;
}
else
{
if(n3>n4)
large=n3;
else
large=n4;
}
System.out.println(large+" is the largest number of the given four numbers.");
}
}