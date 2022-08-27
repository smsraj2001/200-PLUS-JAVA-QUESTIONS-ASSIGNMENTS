/**Write a program to input a number and check whether it is a palindrome or not.*/

import java.util.*;
public class PROGRAM26
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:-");
int num=sc.nextInt();
int n=num,r=0,rev=0;
while(n!=0)
{
r=n%10;
rev=(rev*10)+r;
n=n/10;
}
if(num==rev)
System.out.println(num+" is a palindrome number.");
else
System.out.println(num+" is not a palindrome number.");
}
}