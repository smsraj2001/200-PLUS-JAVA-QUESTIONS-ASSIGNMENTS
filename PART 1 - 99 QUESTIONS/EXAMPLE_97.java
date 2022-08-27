/**Write a program to check whether a number is Palindrome number not:-*/

import java.util.*;
public class EXAMPLE_97
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to check it is a palindrome or not:-");
int num=sc.nextInt();
int n=num;
int rev=0;
int q=0,r=0;
do
{
r=n%10;
System.out.println("Digits of the number:-");
System.out.println(r);
rev=rev*10+r;
System.out.println("Reverse of the number:-");
System.out.println(rev);
n=n/10;
}
while(n>0);
if(num==rev)
System.out.println(num+" is a palindrome number.");
else
System.out.println(num+" is not a palindrome number.");
}
}