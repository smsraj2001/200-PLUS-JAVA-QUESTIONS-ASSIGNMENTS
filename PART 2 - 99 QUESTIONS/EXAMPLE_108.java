/**Write a program to check whether a number is a spy number or not.*/

import java.util.*;
public class EXAMPLE_108
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:-");
int num=sc.nextInt();
int n=num,d=0,r=0,pro=1,sum=0;
while(n>0)
{
r=n%10;
sum=sum+r;
n=n/10;
}
while(n>0)
{
r=n%10;
pro=pro*r;
n=n/10;
}
if(sum==pro)
System.out.println(num+" is a spy number.");
else
System.out.println(num+" is a spy number.");
}
}
 
    