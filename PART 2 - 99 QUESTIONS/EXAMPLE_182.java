/**Previous years question:-*/

import java.util.*;
public class EXAMPLE_182
{
public static void Floyd()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows:-");
int n=sc.nextInt();
int a=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(a+" ");
a++;
}
System.out.println();
}
}
public static void Pattern()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:-");
String S=sc.next();
for(int i=1;i<=S.length();i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(S.charAt(j-1)+" ");
}
System.out.println();
}
}
public static void Special_palindrome()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:-");
String S=sc.next(),p="";
int l=S.length();
for(int i=l-1;i>=0;i--)
{
char ch=S.charAt(i);
p=p+ch;
}
if(S.charAt(0)==S.charAt(l-1)&&p.equalsIgnoreCase(S))
System.out.println(S+" is a palindrome cum special word.");
else if(S.charAt(0)==S.charAt(l-1))
System.out.println(S+" is a special word.");
else
System.out.println(S+" is niether a special word nor a palindrome.");
}
public static void sum()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the frequency of the series:-");
int n=sc.nextInt();
long sum=1,T_sum=0;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
sum=sum*j;
}
T_sum=T_sum+sum;
sum=1;
}
System.out.println("The sum is "+T_sum+".");
}
public static void main(String[]args)
{
System.out.println("\"FLOYD'S TRIANGLE\"");
Floyd();
System.out.println("\"PATTERN\"");
Pattern();
System.out.println("\"SPECIAL_PALINDROME\"");
Special_palindrome();
System.out.println("\"SUM\"");
sum();
}
}