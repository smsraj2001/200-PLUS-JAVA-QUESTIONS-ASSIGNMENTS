/**Write a program to find area of rectangle using function (TYPE 2):-*/

import java.util.*;
public class EXAMPLE_44
{
public void area()
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
EXAMPLE_44 obj=new EXAMPLE_44();/**Object creation.*/
obj.area();/**Function call using object.*/
}
}
/**This function is without return_type,without arguments and using objects.*/
    
