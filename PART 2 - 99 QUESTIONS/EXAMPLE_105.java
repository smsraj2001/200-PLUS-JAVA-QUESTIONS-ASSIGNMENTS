/**Write a program to find whether a number is a special number or not.It should be a 2 digit number.*/

import java.util.*;
public class EXAMPLE_105
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a double digit numner:-");
int num=sc.nextInt();
int n=num;
int q=0,r=0,sum=0,pro=0;
if(n>=10&&n<=99)
{
q=n/10;
r=n%10;
sum=q+r;
pro=q*r;
if((sum+pro)==num)
System.out.println(num+" is a special numner.");
else
System.out.println(num+" is not a special numner.");
}
else
System.out.println("Wrong number.Enter a 2 digit number.");
}
}