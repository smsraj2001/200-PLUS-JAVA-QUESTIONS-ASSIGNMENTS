/**Write a program to print prime numbers from starting number to ending number.*/

import java.util.*;
public class EXAMPLE_170
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the starting number:-");
int a=sc.nextInt();
System.out.println("Enter the ending number:-");
int b=sc.nextInt(),c=0;
for(int i=a;i<=b;i++)
{
int n=i;
for(int j=1;j<=i;j++)
{
if(n%j==0)
c++;
}
if(c==2)
System.out.println(i+" is a prime number.");
c=0;
}
}
}