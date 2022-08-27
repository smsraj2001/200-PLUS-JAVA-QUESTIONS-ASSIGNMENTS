/**Write a program to print the following series:-
(1+2)/(1*2) + (1+2+3)/(1*2*3) +n......*/

import java.util.*;
public class EXAMPLE_144
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number for the series:-");
int n=sc.nextInt();
double sum=0,fact=1;
double Tsum=0;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
sum=sum+j;
fact=fact*j;
}
Tsum=(Tsum+(sum/fact));
System.out.println(Tsum);
}
System.out.println("The sum of the series is "+Tsum+".");
}
}