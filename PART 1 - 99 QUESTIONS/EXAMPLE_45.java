/**Write a program to find area of rectangle using function (TYPE 3):-*/

import java.util.*; 
public class EXAMPLE_45
{
public void area(int l1,int b1)/**Formal parameters.*/
{
int r=l1*b1;
/**If arguments are passed,don't take input from the user.*/
System.out.println("The ara of the rectangle is "+r+".");
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of length of rectangle:-");
int l=sc.nextInt();
System.out.println("Enter the value of breadth of rectangle:-");
int b=sc.nextInt(); 
EXAMPLE_45 obj=new EXAMPLE_45();
obj.area(l,b);/**Actual parameters.*/
}
} 
/**This is the function with arguments,without return_type and with object.*/  