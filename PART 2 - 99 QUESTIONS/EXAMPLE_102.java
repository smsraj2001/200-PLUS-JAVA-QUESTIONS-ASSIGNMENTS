/**Write a program to find a number as special number or not:-*/

import java.util.*;
public class EXAMPLE_102
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:-");
int num=sc.nextInt();
int n=num;
int r=0,rem=0,fact=1,sum=0,b=0;
while(n>0)
{
r=n%10;
for(int i=1;i<=r;i++)
{
fact=fact*i;
}
sum=sum+fact;
fact=1;
n=n/10;
}
if(num==sum)
System.out.println(num+" is a special number.");
else
System.out.println(num+" is not a special number.");
}
}