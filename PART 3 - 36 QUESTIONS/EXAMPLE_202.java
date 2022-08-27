/**Write a program to check whether a number is Smith number or not.*/

import java.util.*;
public class EXAMPLE_202
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:-");
int num=sc.nextInt();
int n=num,sum=0,r=0;
while(n!=0)
{
r=n%10;
sum=sum+r;
n=n/10;
}
System.out.println("The sum of digits of "+num+" is "+sum+".");
int count=0,prime=0,p=0,Tsum=0,s=0,t=0;
for(int i=1;i<=num;i++)
{
int n1=i;
for(int j=1;j<=num;j++)
{
if(n1%j==0)
count=count+1;
}
if(count==2)
{
prime=i;
System.out.println("Prime : "+prime);
}
if(prime>=10)
{
p=prime;
while(p!=0)
{
t=p%10;
s=s+t;
p=p/10;
}
Tsum=Tsum+s;
}
else
{
Tsum=Tsum+prime;
}
count=0;
}
if(Tsum==sum)
System.out.println(num+" is a Smith number.");
else
System.out.println(num+" is not a Smith number.");
}
}