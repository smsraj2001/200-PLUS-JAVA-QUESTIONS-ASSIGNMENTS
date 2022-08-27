/**Write a program to display the first 10 terms of Fibonacci series.*/

import java.util.*;
public class EXAMPLE_80
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of terms:-");
int n=sc.nextInt(); 
int a=0,b=1,c=0;
System.out.println("The numbers in fibbonacci series is :-");
System.out.println(a);
System.out.println(b);
for(int i=1;i<=n-2;i++)
{
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}