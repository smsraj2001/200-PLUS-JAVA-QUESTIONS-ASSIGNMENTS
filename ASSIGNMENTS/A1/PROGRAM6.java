
/**Write a program to find the area and circumference of circle.*/

import java.util.*; 
public class PROGRAM6
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of radius:-");
int r=sc.nextInt();
double area,circumference;
area=Math.PI*r*r;/**Math.PI means the value of pi,that is:22/7*/
System.out.println("The area of the circle is " +area+".");
circumference=2*(3.14)*r;
System.out.println("The circumference of the circle is " +circumference+".");
   
    }
}
