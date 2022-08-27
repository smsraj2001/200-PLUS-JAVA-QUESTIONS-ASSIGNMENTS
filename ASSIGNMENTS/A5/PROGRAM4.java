/**Write a program that takes an integer argument and prints the following pattern,shown for
n=4.
a
aa
aaa
aaaa
aaa
aa
a       */

import java.util.*;
public class PROGRAM4
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter '4' to get the pattern in question:-");
System.out.println("Enter the number:-");
int n=sc.nextInt();
int i,j,c,k;
c=n-1;
for(i=1;i<=n;i++)
{
for(k=1;k<=c;k++)
{
System.out.print("");
}
for(j=1;j<=i;j++)
{
System.out.print("a");
}
System.out.println();
c=c-1;
}
c=c+2;
for(i=n-1;i>=1;i--)
{
for(k=1;k<=c;k++)
{
System.out.print("");
}
for(j=1;j<=i;j++)
{
System.out.print("a");
}
System.out.println();
c=c+1;
}
}
}