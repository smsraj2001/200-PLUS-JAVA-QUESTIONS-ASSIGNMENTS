/**Write a program to find the sum of the series : x^1/1! + x^2/2! - x^3/3!.......*/

import java.util.*;
public class EXAMPLE_135
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value for x:-");
int x=sc.nextInt();
double d,sum=0;
int c=1,fact=1;
for(int i=1;i<=x;i++)
{
fact=fact*i;
System.out.println("Factorial of "+i+" is "+fact+".");
d=((Math.pow(x,i))/fact)*c;
sum=sum+d;
c=c*-1;
}
System.out.println("The sum of the series is "+sum+".");
}
}
