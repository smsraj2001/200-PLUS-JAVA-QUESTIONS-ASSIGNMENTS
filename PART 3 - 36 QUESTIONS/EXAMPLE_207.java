/**Write a program tom check whether a five digit number is friendly number or not.*/

import java.util.*;
public class EXAMPLE_207
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a five digit number:-");
int n=sc.nextInt();
if(n<10000||n>=100000)
{
System.out.println("Enter a valid 5 digit number.");
System.exit(0);
}
int a=n%5;
int b=(n/10)%4;
int c=(n/100)%3;
int d=(n/1000)%2;
int e=(n/10000)%1;
if(a==0&&b==0&&c==0&&d==0&&e==0)
System.out.println(n+" is a friendly five digit number.");
else
System.out.println(n+" is not a friendly five digit number.");
}
}
