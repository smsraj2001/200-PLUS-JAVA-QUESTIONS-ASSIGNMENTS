/**WORKSHEET : 3
Write a Java program to input the sides of a triangle.Pass the sides to a function 
decide(int x,int y,int z) which checks and prints whether the triangle is equilateral,
isosceles or scalene.*/

import java.util.*;
public class EXAMPLE_57
{
public static void decide(int x,int y,int z)
{
if(x==y&&y==z&&z==x)
System.out.println("The given triangle with sides "+x+" , "+y+" and "+z+" is a equilateral triangle.");
else if(x==y||y==z||z==x)
System.out.println("The given triangle with sides "+x+" , "+y+" and "+z+" is a isosceles triangle.");
else
System.out.println("The given triangle with sides "+x+" , "+y+" and "+z+" is a scalene triangle.");
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
EXAMPLE_57 obj=new EXAMPLE_57();
System.out.println("          WORKSHEET : 3");
System.out.println("Enter the first side of the triangle:-");
int x1=sc.nextInt();
System.out.println("Enter the second side of the triangle:-");
int y1=sc.nextInt();
System.out.println("Enter the third side of the triangle:-");
int z1=sc.nextInt();
obj.decide(x1,y1,z1);
}
}

