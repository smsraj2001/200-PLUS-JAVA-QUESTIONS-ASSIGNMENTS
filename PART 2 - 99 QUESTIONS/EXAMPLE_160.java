/**Function overloading using area program.*/

import java.util.*;
public class EXAMPLE_160
{
public static double area=0.0d;
public static double area(double r)
{
area=Math.PI*r*r;
return area;
}
public static double area(int s)
{
area=s*s;
return area;
}
public static double area(int l,int b)
{
area=l*b;
return area;
}
public static double area(double d1,double d2)
{
area=0.5*d1*d2;
return area;
}
public static void main(String[]args)
{
double R=0;
Scanner sc=new Scanner(System.in);
System.out.println("       CIRCLE");
System.out.println("Enter the radius of the circle:-");
double r1=sc.nextDouble();
R=area(r1);
System.out.println("The area of the circle is "+R+".");
System.out.println("       SQUARE"); 
System.out.println("Enter the side of the square:-");
int s1=sc.nextInt();  
R=area(s1);
System.out.println("The area of the square is "+R+".");
System.out.println("       RECTANGLE"); 
System.out.println("Enter the length of the rectangle:-");
int l1=sc.nextInt();
System.out.println("Enter the breadth of the rectangle:-");
int b1=sc.nextInt();
R=area(l1,b1);
System.out.println("The area of the rectangle is "+R+".");
System.out.println("       RHOMBUS"); 
System.out.println("Enter the first diagonal of the rhombus:-");
double d$1=sc.nextDouble();
System.out.println("Enter the first diagonal of the rhombus:-");
double d$2=sc.nextDouble();
R=area(d$1,d$2);
System.out.println("The area of the rhombus is "+R+".");
}
}