/**Write a program to accept three numbers by the user and arrange it in the ascending order.*/

import java.util.*;
public class EXAMPLE_32 
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("\t\t\tEnter three numbers:-");
System.out.println("Enter the first number:-");
int n1=sc.nextInt();
System.out.println("Enter the second number:-");
int n2=sc.nextInt();
System.out.println("Enter the third number:-");
int n3=sc.nextInt();
int x=n1,y=n2,z=n3;
if(x<y)
{
if(z<x)
System.out.println("The ascending order is "+z+" < "+x+" < "+y);
else if(z>y)
System.out.println("The ascending order is "+x+" < "+y+" < "+z);
else
System.out.println("The ascending order is "+x+" < "+z+" < "+y);
}
else
{
if(z<y)
System.out.println("The ascending order is "+z+" < "+y+" < "+x);
else if(z>x)
System.out.println("The ascending order is "+y+" < "+x+" < "+z);
else
System.out.println("The ascending order is "+y+" < "+z+" < "+x);
}
}
}















