/**Write a program to input two numbers and check whether they are a twin prime numbers or not.*/

import java.util.*;
public class PROGRAM25
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number:-");
int n1=sc.nextInt();
System.out.println("Enter second number:-");
int n2=sc.nextInt();
int c1=0,c2=0;
for(int i=1;i<=n1;i++)
{
if(n1%i==0)
c1++;
}
for(int i=1;i<=n2;i++)
{
if(n2%i==0)
c2++;
}
if(c1==2&&c2==2)
{
if(n1-n2==2||n1-n2==-2)
System.out.println(n1+" and "+n2+" are twin prime numbers.");
else
System.out.println(n1+" and "+n2+" are not twin prime numbers.");
}
else
{
if(c1!=2&&c2==2||c1==2&&c2!=2)
System.out.println("One of the numbers is not a prime number.");
else
System.out.println("They are not prime numbers.");
}
}
}