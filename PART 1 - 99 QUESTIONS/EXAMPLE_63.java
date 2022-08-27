/**Write a program to input number by user and print the numbers and print the sum of the numbers
printed.*/

import java.util.*;
public class EXAMPLE_63
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:-");
int n=sc.nextInt();
int i=1,sum=0;
for(;i<=n;i++)
{
System.out.println(i);
sum=i+sum;;
}
System.out.println("The sum of above printed numbers is "+sum+".");
}
}