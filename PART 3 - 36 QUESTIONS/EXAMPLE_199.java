/**Loop programs based on numbers.*/

import java.util.*;
public class EXAMPLE_199
{
public static void Program1()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of terms:-");
int n=sc.nextInt();
for(int i=3;i<=n-3;i++)
{
long term=(long)(Math.pow(2,i)+2);
if(term>100&&term%5==0)
break;
else if(term%3==0)
continue;
else
System.out.println(term);
}
}
public static void Program2()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:-");
int n=sc.nextInt();
double n_sqrt=Math.sqrt(n);
if(n_sqrt*n_sqrt==n)
System.out.println(n+" is a perfect square number.");
else
System.out.println(n+" is not a perfect square number.");
}
public static void Program3()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of terms:-");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
long term=(long)(Math.pow(i,i-1));
System.out.println(term);
}
}
public static void main(String[]args)
{
System.out.println("\t\"PROGRAM 1\"");
Program1();
System.out.println("\t\"PROGRAM 2\"");
Program2();
System.out.println("\t\"PROGRAM 3\"");
Program3();
}
}