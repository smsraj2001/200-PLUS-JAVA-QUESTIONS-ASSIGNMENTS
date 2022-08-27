/**Write a program to print the tables of any number.*/

import java.util.*;
public class EXAMPLE_175
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to print its table:-");
System.out.println("Enter 0 to stop iterations.");
long n=sc.nextLong();
while(n!=0)
{
for(long i=n;i<=n;i++)
{
if(n==0)
break;
for(long j=1;j<=10;j++)
{
long pro=i*j;
System.out.println(i+" X "+j+" = "+pro);
}
}
System.out.println("Enter another number:-");
n=sc.nextLong();
}
}
}