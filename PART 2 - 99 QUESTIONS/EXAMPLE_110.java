/**Write a program to find the total of n numbers using an array.*/

import java.util.*;
public class EXAMPLE_110
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array:-");
int n=sc.nextInt();
int total[]=new int[n],sum=0;
System.out.println("Enter the numbers to find the sum:-");
for(int i=0;i<n;i++)
{
total[i]=sc.nextInt();
sum=sum+total[i];
}
System.out.println("The sum of numbers is "+sum+".");
}
}
