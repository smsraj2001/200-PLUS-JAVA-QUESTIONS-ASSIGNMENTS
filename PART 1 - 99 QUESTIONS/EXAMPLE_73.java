/** Write a program to accept a number from keyboard and check if it’s a prime number or not.*/

import java.util.*;
public class EXAMPLE_73
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number ");
int n=sc.nextInt();
int i;
for(i=2;i<=n;i++)
{
if(n%i==0)
break;
}
if(n==i)
{
System.out.println(n+" is a prime number. ");  
} 
else
{
System.out.println(n+" is not a prime number. ");
}
}
}