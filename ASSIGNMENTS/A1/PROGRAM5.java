
/**Write a program to find the area and perimeter of rectangle.*/

import java.util.*;
public class PROGRAM5
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of length:-");
int l=sc.nextInt();
System.out.println("Enter the value of breadth:-");
int b=sc.nextInt();
int area,perimeter;
area=l*b;
System.out.println("The area of the rectangle is "+area+".");
perimeter=2*(l+b);
System.out.println("The perimeter of the rectangle is "+perimeter+".");
   
    }
}
