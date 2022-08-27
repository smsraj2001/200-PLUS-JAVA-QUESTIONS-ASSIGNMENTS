/**Write a program to print the following series: 1/1+2 + 1/1+2+3.......*/

import java.util.*;
public class EXAMPLE_157
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the end term for the series:-");
int n=sc.nextInt();
double sum1=0,sum2=0,Tsum=0;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
sum2=1/j;
sum1=sum1+sum2;
}
Tsum=Tsum+sum1;
}
System.out.println("The sum of the series is "+Tsum+".");
}
}
