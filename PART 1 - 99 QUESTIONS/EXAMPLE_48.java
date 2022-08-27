/**Write a program to find the perimeter and area of the circle using 2 functions.TYPE 4.*/

import java.util.*;
public class EXAMPLE_48
{
public double Per(int r1)
{
double P1=2*Math.PI*r1;
return P1;
}
public double area(int r1)
{
double area1=Math.PI*r1*r1;
return area1;
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of the circle:-");
int r=sc.nextInt();
EXAMPLE_48 obj=new EXAMPLE_48();
double P=obj.Per(r);
double area=obj.area(r);
System.out.println("The area of the circle is "+P+".");
System.out.println("The circumference of the circle is "+area+".");
}
}