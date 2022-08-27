/**Write a program to calculate the distance between 2 points (x1,y1) and (x2,y2).*/

import java.util.*; 
public class EXAMPLE_19
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the coordinates of (x1,y1):_");
System.out.println("Enter the value of x1:-");
int x1=sc.nextInt();
System.out.println("Enter the value of y1:-");
int y1=sc.nextInt();
System.out.println("Enter the coordinates of (x2,y2):_");
System.out.println("Enter the value of x2:-");
int x2=sc.nextInt();
System.out.println("Enter the value of y2:-");
int y2=sc.nextInt();
double dist;
dist=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
System.out.println("The distance between the given two points is "+dist+".");
}
}


    