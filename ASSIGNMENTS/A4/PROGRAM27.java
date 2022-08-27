/**Write a program to input a number and check whether it is a armstrong number or not.*/

import java.util.*;
public class PROGRAM27
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:-");
int num=sc.nextInt();
int n=num,r=0,cube=0,sum=0;
while(n>0)
{
r=n%10;
cube=r*r*r;
sum=sum+cube;
n=n/10;
}
if(num==sum)
System.out.println(num+" is an armstrong number.");
else
System.out.println(num+" is not an armstrong number.");
}
}