/**Write a  program to enter a number and print it in reverse order and check it’s a palindrome or not.*/

import java.util.*;
public class EXAMPLE_75
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number ");
int n=sc.nextInt();
int ori;
ori=n;
int rev=0,rem;
while(n!=0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;
} 
if(ori==rev)
System.out.println("Number is palindrome."); 
else
System.out.println("Number is not palindrome."); 
}  
}