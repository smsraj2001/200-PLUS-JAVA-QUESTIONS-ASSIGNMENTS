/**Write a program to find the largest of three numbers entered by the user and print it.*/

import java.util.*;
public class EXAMPLE_28
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
int max;
if(n1>n2)
{
if(n1>n3)
max=n1;
else
max=n3;
}
else
{
if(n2>n3)
max=n2;
else
max=n3;
}
System.out.println(max+" is the largest of the given three numbers.");
}
}
