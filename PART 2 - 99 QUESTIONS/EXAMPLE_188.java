/**Write a program to find the prime factorial of a prime number.*/

import java.util.*;
public class EXAMPLE_188
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:-");
int n=sc.nextInt(),c=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
c=c+1;
}
int fact=1,count=0;
if(c==2)
{
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(i%j==0)
count=count+1;
}
if(count==2)
fact=fact*i;
count=0;
}
System.out.println("The prime factorial is "+fact+".");
}
else
System.out.println(n+" is not a prime number.");
}
}
