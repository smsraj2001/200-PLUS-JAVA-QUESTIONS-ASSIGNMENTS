/**Write a menu driver program to calculate the volume of sphere,cube or cuboid according to the user's choice.*/

import java.util.*;
public class EXAMPLE_27
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter '1' to find the area of cube.");
System.out.println("Enter '2' to find the area of cuboid.");
System.out.println("Enter '3' to find the area of sphere.");
System.out.println("Enter your choice:-");
int choice=sc.nextInt();
int l,b,a,r,h;
double volume;
switch(choice)
{
case 1 :
System.out.println("Enter the side of the cube:-");
a=sc.nextInt();
volume=(double)a*a*a;
System.out.println("The volume of the cube is "+volume+".");
break;
case 2 :
System.out.println("Enter the length of the cuboid:-");
l=sc.nextInt();
System.out.println("Enter the breadth of the cuboid:-");
b=sc.nextInt();
System.out.println("Enter the height of the cuboid:-");
h=sc.nextInt();
volume=(double)l*b*h;
System.out.println("The volume of the cuboid is "+volume+".");
break;
case 3 :
System.out.println("Enter the radius of the sphere:-");
r=sc.nextInt();
volume=(double)Math.PI*(4/3)*(Math.pow(r,3));
System.out.println("The volume of the sphere is "+volume+".");
break;
default:
System.out.println("It is a wrong choice.");
break;
}
}
}