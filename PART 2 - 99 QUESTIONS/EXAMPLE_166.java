/**Write a program to find a multiple harshad number.*/

import java.util.*;
public class EXAMPLE_166
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:-");
int num=sc.nextInt();int n=num,r=0,sum=0;
while(n!=0)
{
r=n%10;
sum=sum+r;
n=n/10;
}
int quo=0,q=quo,r1=0,sum1=0;
if(num%sum==0)
{
quo=num/sum;
q=quo;
while(q!=0)
{
r1=q%10;
sum1=sum1+r1;
q=q/10;
}
if(quo%sum1==0)
System.out.println(num+" is a multiple harshad number.");
else
System.out.println(num+" is not a multiple harshad number,but is a harshad number.");
}
else
System.out.println(num+" is neither a harshad number nor a multiple harshad number.");
}
}