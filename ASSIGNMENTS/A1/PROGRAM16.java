/**write a program to find the maximum of two numbers.*/

import java.util.*;
public class PROGRAM16
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of first number:-");
int x=sc.nextInt();
System.out.println("Enter the value of second number:-");
int y=sc.nextInt();
int result;
result=Math.min(x,y);
System.out.println("The maximum of "+ x+" and "+y+" is " + result+".");
}
}   
    
