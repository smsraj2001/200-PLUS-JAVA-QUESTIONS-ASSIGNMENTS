/**Write a program to find area of rectangle using function (TYPE 1):-*/

import java.util.*;
public class EXAMPLE_43
{
public static void area()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of length of the rectangle:-");
int l=sc.nextInt();
System.out.println("Enter the value of breadth of the rectangle:-");
int b=sc.nextInt();
int A=l*b;
System.out.println("The area of the rectangle is "+A+".");
}
public static void main(String[]args)
{
area();/**Function call.*/
}
}
/**This is a function without an object,without arguments and without return type.*/
  