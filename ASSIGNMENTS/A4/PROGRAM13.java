/**Write a program to find and display the products of a number from 1 to N.*/

import java.util.*;
public class PROGRAM13
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to find the products:-");
int N=sc.nextInt();
int product=1;
for(int i=1;i<=N;i++)
{
System.out.println("The number is "+i+".");
product=product*i;
}
System.out.println("The product of the numbers are "+product+".");
}
}    