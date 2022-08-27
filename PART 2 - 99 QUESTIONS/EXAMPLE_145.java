/**Write a program to print all prime numbers between 1 to n:-*/

import java.util.*;
public class EXAMPLE_145
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n:-");
long n=sc.nextLong();
int flag,i,j;
for(i=1;i<=n;i++)
{
flag=0;
for(j=2;j<=i-1;j++)
{
if(i%j==0)
{
flag=1;
break;
}
}
if(flag==0)
System.out.println("The prime number is "+i+".");
}
}
}