/**Write a program to calculate compound interest using while statement.*/

import java.util.*;
public class EXAMPLE_222
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the principle amount:-");
double P=sc.nextInt();
System.out.println("Enter the rate of interest:-");
double R=sc.nextInt();
System.out.println("Enter the time period:-");
int T=sc.nextInt();
int year=1;
double A=0.00d,PA=1,CI=0.00;
while(year<=T)
{
A=(double)((100+R)/100);
PA=PA*A;
year=year+1;
}
PA=PA*P;
CI=PA-P;
System.out.println("The final amount is "+PA+".");
System.out.println("The Compound interest is "+CI+".");
}
}