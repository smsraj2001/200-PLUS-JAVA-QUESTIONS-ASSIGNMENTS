/**Write a program to find and display the sum of 1^2+2^2+3^2,etc....*/

import java.util.*;
public class PROGRAM8
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to find the sum of the series:-");
int N=sc.nextInt();
int sum=0;
System.out.println("The series is:-");
for(int i=1;i<=N;i++)
{
int sq=(int)Math.pow(i,2);
System.out.print(i+"^2"+",");
sum=sum+sq;
}
System.out.println();
System.out.println("The sum of the series is "+sum+".");
}
}