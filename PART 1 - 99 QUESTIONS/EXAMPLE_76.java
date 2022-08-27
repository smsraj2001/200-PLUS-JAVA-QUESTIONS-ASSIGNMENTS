/**Write a program to enter a number and print the sum of its digits.*/

import java.util.*;
public class EXAMPLE_76
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println(" Enter a number :- ");    
int n=sc.nextInt();
int sum=0,rem;
while(n!=0)
{
rem=n%10;
sum=sum+rem;
n=n/10;
}
System.out.println("Sum of the digits of number is "+sum+"."); 
}
}