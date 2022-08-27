/**Write a program to input a number and check whether it is a neon number or not.*/

import java.util.*;
public class PROGRAM28
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:-");
int n=sc.nextInt();
int sq=n*n,r=0,sum=0;
while(sq!=0)
{
r=sq%10;
sum=sum+r;
sq=sq/10;
}
if(sum==n)
System.out.println(n+" is a neon number.");
else
System.out.println(n+" is not a neon number.");
}
}