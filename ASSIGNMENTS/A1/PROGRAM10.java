/**Write a program to find the area of a triangle using sqrt(S*(S-L1)*(S-L2)*(S*L3)).*/

import java.util.*;
public class PROGRAM10
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of first length:-");
double a=sc.nextInt();
System.out.println("Enter the value of second length:-");
double b=sc.nextInt();
System.out.println("Enter the value of third length:-");
double c=sc.nextInt();
double S,area;
S=(a+b+c)/(2);
area=Math.sqrt(S*(S-a)*(S-b)*(S*c));
System.out.println("The semiperimeter is "+S+".");
System.out.println("The area of the Triangle is "+area+".");    
    }
}
