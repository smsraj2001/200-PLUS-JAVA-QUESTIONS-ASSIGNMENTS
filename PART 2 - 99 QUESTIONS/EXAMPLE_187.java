/**Write a program to check whether a number is deficient number or perfect number or abundant number.*/

import java.util.*;
public class EXAMPLE_187
{
public static int Number(int n1)
{
int sum=0;
for(int i=1;i<=n1;i++)
{
if(n1%i==0)
sum=sum+i;
}
int p=2*n1;
if(sum<p)
return -1;
else if(sum==p)
return 0;
else
return 1;
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:-");
int n=sc.nextInt();
int result=Number(n);
if(result==-1)
System.out.println(n+" is a deficient number.");
if(result==0)
System.out.println(n+" is a perfect number.");
if(result==1)
System.out.println(n+" is a abundant number.");
}
}