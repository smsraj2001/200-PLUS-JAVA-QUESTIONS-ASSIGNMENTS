/**Write a program to find area of rectangle using function (TYPE 4):-*/

import java.util.*;
public class EXAMPLE_46
{
public static int area(int l1,int b1)
{
int r=l1*b1;
return r;/**Only 1 variable can be returned.*/
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of the length of the rectangle:-");
int l=sc.nextInt();
System.out.println("Enter the value of the breadth of the rectangle:-");
int b=sc.nextInt();
EXAMPLE_46 obj=new EXAMPLE_46();
int r2=obj.area(l,b);
System.out.println("The area of the rectangle is "+r2+".");
}
} 
/**The program is with functions,objects,parameters and return_type.*/    