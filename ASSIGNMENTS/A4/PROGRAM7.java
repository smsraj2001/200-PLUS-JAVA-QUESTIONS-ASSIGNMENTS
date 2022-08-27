/**Write a program to find and display the sum of numbers from 1 to N.*/

import java.util.*;
public class PROGRAM7
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to find the sum:-");
int N=sc.nextInt();
int sum=0;
for(int i=1;i<=N;i++)
{
System.out.println("The number is "+i+".");
sum=sum+i;
}
System.out.println("The sum of the numbers are "+sum+".");
}
}    