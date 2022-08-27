/**Write a program to input a number and find the sum of the digits:-*/

import java.util.*;
public class EXAMPLE_96
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to find the sum of the digits:-");
long num=sc.nextLong();
long n=num;
long sum=0;
long r=0;
do
{
r=n%10;
sum=sum+r;
n=n/10;
}
while(n>0);
System.out.println("The sum of the digits of "+num+" is "+sum+".");
}
}