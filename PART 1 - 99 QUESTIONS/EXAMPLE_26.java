/**Write a menu driver switch case ptrogram to find the area of rectangle,square,circle or triangle according to the 
user's choice.*/
 
import java.util.*;
public class EXAMPLE_26
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 'r' to find the area of rectangle.");
System.out.println("Enter 's' to find the area of square.");
System.out.println("Enter 'c' to find the area of circle.");
System.out.println("Enter 't' to find the area of triangle for three sides.");
System.out.println("Enter 'T' to find the area of triange for base and height.");
System.out.println("Enter your choice:-");
char choice=sc.next().charAt(0);
int l,b,a,r,h,ba,l1,l2,l3;
double S,area;
switch(choice)
{
case 'r' :
System.out.println("Enter the length of the rectangle:-");
l=sc.nextInt();
System.out.println("Enter the breadth of the rectangle:-");
b=sc.nextInt();
area=(double)l*b;
System.out.println("The area of the rectangle is "+area+".");
break;
case 's' :
System.out.println("Enter the side for the area of the square:-");
a=sc.nextInt();
area=(double)a*a;
break;
case 'c' :
System.out.println("Enter the radius of the circle:-");
r=sc.nextInt();
area=(double)Math.PI*r;
System.out.println("The area of the circle is "+area+".");
break;
case 't' :
System.out.println("Enter the base of the triangle:-");
ba=sc.nextInt();
System.out.println("Enter the height of the triangle:-");
h=sc.nextInt();
area=(double)(1/2)*(h)*(ba);
System.out.println("The area of the triangle is "+area+".");
break;
case 'T' :
System.out.println("Enter the first length of the triangle:-");
l1=sc.nextInt();
System.out.println("Enter the second length of the triangle:-");
l2=sc.nextInt();
System.out.println("Enter the third length of the triangle:-");
l3=sc.nextInt();
S=(l1+l2+l3)/2;
System.out.println("The semiperimeter is "+S);
area=Math.sqrt(S*(S-l1)*(S-l2)*(S-l3));
System.out.println("The area of the triangle is "+area+".");
break;
default:
System.out.println("It is a wrong choice.");
break;
}
}
}