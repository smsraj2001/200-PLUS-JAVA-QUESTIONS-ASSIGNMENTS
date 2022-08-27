/**Write a program to find whether a number is an automorphic number or not:-*/

import java.util.*;
public class EXAMPLE_100
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to check whether a number is Armstrong number or not:-");
int num=sc.nextInt();
int n=num;
int r=0;
int sum=0;int c=0;
do
{
r=n%10;
c=r*r*r;
sum=sum+c;
n=n/10;
}
while(n>0);
if(sum==num)
System.out.println(num+" is an armstrong number.");
else
System.out.println(num+" is not an armstrong number.");
}
}


