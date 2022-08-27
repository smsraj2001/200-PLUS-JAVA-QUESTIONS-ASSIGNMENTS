/**Write a program to find the perimeter and area of the circle using 2 functions.TYPE 3.*/

import java.util.*;
public class EXAMPLE_47
{
public void Per(int r1)
{
double P=2*Math.PI*r1;
System.out.println("The circumference of the circle is "+P+".");
}
public void area(int r1)
{
double A=Math.PI*r1*r1;
System.out.println("The area of the circle is "+A+".");
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of the circle:-");
int r=sc.nextInt();
EXAMPLE_47 obj=new EXAMPLE_47();
obj.Per(r);
obj.area(r);
}
}    