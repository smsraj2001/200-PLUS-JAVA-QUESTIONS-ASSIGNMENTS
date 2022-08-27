/**Write a program to display the series 10,8,16,14,28 upto n terms.*/

import java.util.*;
public class PROGRAM19
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of terms for the series as a pair:-");
System.out.println("For eg: If you enter 5 , you will get 10 numbers in the series.");
int n=sc.nextInt();
int a=10,b=8;
System.out.println("The series is:-");
System.out.print(a+","+b+",");
for(int i=1;i<=n-1;i++)
{
b=b*2;
a=b;
a=a-2;
System.out.print(b+",");
System.out.print(a+",");
b=a;
}
}
}