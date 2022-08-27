/**Write a program using the function called area(),to compute the area of the following:-
*Circle
*Square
*Rectangle,
using function overloading and display the menu,to print the area as per the user's choice.*/
 
import java.util.*;
public class EXAMPLE_53
{
public void area(double r1)
{
double result=(22/7)*r1*r1;
System.out.println("The area of the circle with radius "+r1+" is "+result+".");
}
public void area(int s1)
{
double result=s1*s1;
System.out.println("The area of the square with side "+s1+" is "+result+".");
}
public void area(int l1,int b1)
{
double result=l1*b1;
System.out.println("The area of the rectangle with sides "+l1+" and "+b1+" is "+result+".");
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
EXAMPLE_53 obj=new EXAMPLE_53();
System.out.println("Enter  'C' for the area of the circle.");
System.out.println("Enter  'S' for the area of the square.");
System.out.println("Enter  'R' for the area of the rectangle.");
System.out.println("Enter your choice:-");
char ch=sc.next().charAt(0);  
switch(ch)
{
case 'C' :
System.out.println("Enter the radius of the circle:-");
double r=sc.nextDouble();
obj.area(r);
break;
case 'S' :
System.out.println("Enter the side of the Square:-");
int s=sc.nextInt();
obj.area(s);
break;
case 'R' :
System.out.println("Enter the sides of the Rectangle:-");
System.out.println("Enter the length of the rectangle:-");
int l=sc.nextInt();
System.out.println("Enter the breadth of the rectangle:-");
int b=sc.nextInt();
obj.area(l,b);
break;
default:
System.out.println("It is a wrong choice.");
}
}
}

