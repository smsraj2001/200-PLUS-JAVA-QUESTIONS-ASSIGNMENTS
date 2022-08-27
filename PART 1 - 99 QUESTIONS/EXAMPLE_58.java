/**WORKSHEET : 4:-
Write a class with the name Perimeter using function overloading that computes the perimeter
of a square,rectangle and circle.
Formula:-
*Perimeter of a square=4*s.
*Perimeter of a rectangle=2*(l+b).
*Perimeter of a circle=2*pi*r.*/

import java.util.*;
public class EXAMPLE_58
{
double R;
public void Per(int s1)
{
R=4*s1;
System.out.println("The perimeter of the square is "+R+".");
}
public void Per(int l1,int b1)
{
R=2*(l1+b1);
System.out.println("The perimeter of the rectangle is "+R+".");
}
public void Per(double r1)
{
R=2*Math.PI*r1;
System.out.println("The perimeter of the circle is "+R+".");
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
EXAMPLE_58 obj=new EXAMPLE_58();
System.out.println("          WORKSHEET : 4");
System.out.println("Enter the side of the square:-");
int s=sc.nextInt();
obj.Per(s);
System.out.println("Enter the sides of the rectangle:-");
System.out.println("Enter the length of the rectangle:-");
int l=sc.nextInt();    
System.out.println("Enter the breadth of the rectangle:-");
int b=sc.nextInt();
obj.Per(l,b);
System.out.println("Enter the radius of the circle:-");
double r=sc.nextDouble();
obj.Per(r);
}
}    