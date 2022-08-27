/**Write a program to find the sum of the series : x^1/1 + x^2/2 - x^3/3.......*/

import java.util.*;
public class EXAMPLE_134
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value for x:-");
int x=sc.nextInt();
double d,sum=0;
int c=1;
for(int i=1;i<=x;i++)
{
d=((Math.pow(x,i))/i)*c;
sum=sum+d;
c=c*-1;
}
System.out.println("The sum of the series is "+sum+".");
}
}
