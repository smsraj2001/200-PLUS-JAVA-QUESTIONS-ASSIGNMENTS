/**Write a program to read the three sides of a triangle and determine whether they form a right angled 
triangle or not.[Use the concept of base,perpendicular and hypotenuse].*/
 
import java.util.*;
public class EXAMPLE_13
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter three sides of a triangle:-");
System.out.println("Enter the first side of the triangle:-");
int p=sc.nextInt();
System.out.println("Enter the second side of the triangle:-");
int b=sc.nextInt();
System.out.println("Enter the third side of the triangle:-");
int h=sc.nextInt();
if((p*p)+(b*b)==(h*h)||((p*p)+(h*h)==(b*b))||((b*b)+(h*h)==(p*p)))
System.out.println("The given triangle is a right-angled triangle.");
else
System.out.println("The given triangle is not a right-angled triangle.");   
    }
}
