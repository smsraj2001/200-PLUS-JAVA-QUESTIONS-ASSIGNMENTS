/**Write a menu driven program to calculate term deposit and recurring deposit.*/

import java.util.*;
public class EXAMPLE_181
{
public static int P=0,r=0,n=0;
public static double A=0.0d;
public static void Term_Deposit()
{
A=P*(Math.pow((1+(r/100)),n));
System.out.println("The term deposit is "+A+".");
}
public static void Recurring_Deposit()
{
n=n*12;
A=(P*n)+(((P*n*(n+1))/2)*(r/100)*(1/12));
System.out.println("The amount after the recurring deposit is "+A+".");
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 for Term deposit.");
System.out.println("Enter 2 for Recurring deposit.");
System.out.println("Enter your choice:-");
int ch=sc.nextInt();
System.out.println("Enter the value of principal amount:-");
P=sc.nextInt();
System.out.println("Enter the rate of interest:-");
r=sc.nextInt();
System.out.println("Enter the time in years:-");
n=sc.nextInt();
switch(ch)
{
case 1 :
Term_Deposit();
break;
case 2 :
Recurring_Deposit();
break;
default :
System.out.println("Invalid choice.");
}
}
}