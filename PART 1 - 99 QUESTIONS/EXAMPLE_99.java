/**Write a program to print the numbers in fibbonacci series:-*/

import java.util.*;
public class EXAMPLE_99
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:-");
long n=sc.nextLong();
long a=0,b=1;
System.out.println("The numbers in fibbonacci series is :-");
System.out.println(a);
System.out.println(b);
long c=0;
for(long i=0;i<=n-2;i++)
{
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}