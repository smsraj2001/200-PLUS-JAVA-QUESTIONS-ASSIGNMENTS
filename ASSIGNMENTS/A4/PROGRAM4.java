/**Write a program to display the series 2,5,10,17 and 26.*/

import java.util.*;
public class PROGRAM4
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 5 to get the series in the question.");
System.out.println("Enter number of terms for the series:-");
int N=sc.nextInt();
int a=2,d=3,c=2;
System.out.println("The series is :- ");
System.out.print(a+",");
for(int i=1;i<=N-1;i++)
{
c=c+d;
d=d+2;
System.out.print(c+",");
}
}
}