/**Write a program to accept four numbers and print the smallest number.*/

import java.util.*;
public class EXAMPLE_35
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
int small;
if(n1<n2)
{
if(n1<n3)
{
if(n1<n4)
small=n1;
else
small=n4;
}
else
{
if(n3<n4)
small=n3;
else 
small=n4;
}
}
else
{
if(n2<n3)
{
if(n2<n4)
small=n2;
else
small=n4;
}
else
{
if(n3<n4)
small=n3;
else
small=n4;
}
}
System.out.println(small+" is the smallest number of the given four numbers.");
}
}   