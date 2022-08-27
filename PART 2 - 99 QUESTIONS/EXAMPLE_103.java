/**Write a program to check if an ISBN code is valid or not.*/

import java.util.*;
public class EXAMPLE_103
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the ISBN code:-");
String n1=sc.next();
int l=n1.length();
if(l==10)
{
long n;
try
{
n=Long.parseLong(n1);
}
catch(Exception e)
{
System.out.println("Enter valid ISBN number.");
sc.close();
return;
}
long d=1,r=0,sum=0,M=0;
while(n>0)
{
r=n%10;
M=d*r;
d=d+1;
sum=sum+M;
n=n/10;
}
if(sum%11==0)
{
System.out.println("Valid ISBN code.");
sc.close();
}
else
{
System.out.println("Invalid ISBN code.");
sc.close();
}
}   
else
{
System.out.println("Enter a 10 digit ISBN number.");
sc.close();
}
}
}