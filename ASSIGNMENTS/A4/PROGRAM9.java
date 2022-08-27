/**Write a program to find and display the sum of 1-2 + 3-4 + 5-6 + etc....*/ 

import java.util.*;
public class PROGRAM9
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to find the sum of the series:-");
int N=sc.nextInt();
int sum=0,a=1,b=2,sub=0;
for(int i=1;i<=N;i++)
{
sub=a-b;
sum=sum+sub;
System.out.print(sub+" + ");
a=a+2;
b=b+2;
}
System.out.println();
System.out.println("The sum of the series is "+sum+".");
}
}