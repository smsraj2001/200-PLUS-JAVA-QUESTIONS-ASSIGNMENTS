/**Write a program to find the super digit of the given number.*/

import java.util.*;
public class EXAMPLE_109
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:-");
int num=sc.nextInt();
int n=num,sum=0,r=0;
while(num>=10)
{
n=num;
sum=0;
while(n>0)
{
r=n%10;
sum=sum+r;
n=n/10;
}
num=sum;
}
System.out.println("The super digit of the given number is "+num+".");
}
}