/**Write a program to find the area of the square,circle,rectangle,triangle,rhombus,parallelogram and trapezium
using function overloading.*/

import java.util.*;
public class EXAMPLE_136
{
public static void area(int l1,int b1)
{
double area=l1*b1;
System.out.println("The area of the rectangle is "+area+".");
}
public static void area(int s1)
{
double area=s1*s1;
System.out.println("The area of the square is "+area+".");
}
public static void area(double r1)
{
double area=Math.PI*r1*r1;
System.out.println("The area of the circle is "+area+".");
}
public static void area(int a,int b,int c)
{
double se=(a+b+c)/2;
double area=Math.sqrt(se*(se-a)*(se-b)*(se-c));
System.out.println("The area of the triangle is "+area+".");
}
public static void area(long d1$,long d2$)
{
double area=(d1$+d2$)/2;
System.out.println("The area of the rhombus is "+area+".");
}
public static void area(int b1,long h1)
{
double area=b1*h1;
System.out.println("The area of the parallelogram is "+area+".");
}
public static void area(int p1$,int p2$,long h1)
{
double area=((p1$+p2$)*h1)/2;
System.out.println("The area of the trapezium is "+area+".");
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("               RECTANGLE");
System.out.println("Enter the length of rectangle:-");
int l=sc.nextInt();
System.out.println("Enter the breadth of rectangle:-");
int b=sc.nextInt();
area(l,b);
System.out.println("               SQUARE");
System.out.println("Enter the side of the square:-");
int s=sc.nextInt();
area(s);
System.out.println("               CIRCLE");
System.out.println("Enter the radius of the circle:-");
double r=sc.nextDouble();
area(r);
System.out.println("               TRIANGLE");
System.out.println("Enter the value of a:-");
int a=sc.nextInt();
System.out.println("Enter the value of b:-");
int b2=sc.nextInt();
System.out.println("Enter the value of c:-");
int c=sc.nextInt();
area(a,b2,c);
System.out.println("               RHOMBUS");
System.out.println("Enter the value of first diagonal:-");
long d1=sc.nextLong();
System.out.println("Enter the value of second diagonal:-");
long d2=sc.nextLong();
area(d1,d2);
System.out.println("               PARALLELOGRAM");
System.out.println("Enter the value of the base:-");
int b3=sc.nextInt();
System.out.println("Enter the value of height:-");
long h1=sc.nextLong();
area(b3,h1);
System.out.println("                TRAPEZIUM");
System.out.println("Enter the value of first parallel side:-");
int p1=sc.nextInt();
System.out.println("Enter the value of second parallel side:-");
int p2=sc.nextInt();
System.out.println("Enter the height of the trapezium:-");
long h2=sc.nextInt();
area(p1,p2,h2);
}
}