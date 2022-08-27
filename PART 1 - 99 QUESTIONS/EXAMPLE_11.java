/**Write a program to check a triangle is valid or not,based on the angles.*/

import java.util.*;
public class EXAMPLE_11
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of first angle of the triangle:-");
int ang1=sc.nextInt();
System.out.println("Enter the value of second angle of the triangle:-");
int ang2=sc.nextInt();
System.out.println("Enter the value of third angle of the triangle:-");
int ang3=sc.nextInt();
int sum=ang1+ang2+ang3;
if(sum==180)
System.out.println("This is a valid triangle.");
else
System.out.println("This is an invalid triangle.");
}
}
