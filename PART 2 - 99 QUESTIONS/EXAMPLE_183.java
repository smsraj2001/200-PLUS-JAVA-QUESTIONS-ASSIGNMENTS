/**Write a program to check whether if 2 numbers are coprime numbers or not.*/

import java.util.*;
public class EXAMPLE_183
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:-");
int a=sc.nextInt();
System.out.println("Enter the second number:-");
int b=sc.nextInt();
int big=0,count=0;
if(a>b)
big=a;
else
big=b;
for(int i=2;i<=big;i++)
{
if(a%i==0&&b%i==0)
count=count+1;
}
if(count==0)
System.out.println(a+" and "+b+" are co-prime numbers.");
else
System.out.println(a+" and "+b+" are not co-prime numbers.");
}
}
