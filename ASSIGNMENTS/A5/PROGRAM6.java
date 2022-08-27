/**Write a program that takes an integer argument and prints the following pattern,shown for
n=4.:-
abcdcba
abc cba
ab   ba
a     a
ab   ba
abc cba
abcdcba          */

import java.util.*;
public class PROGRAM6
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter '4' to obtain the pattern given in question.");
System.out.println("The pattern is :-");
int n=sc.nextInt();
int i,j,c,k;
char ch;
c=1;
ch='a';
for(i=1;i<=n;i++)
System.out.print(ch++);
--ch;
for(i=1;i<n;i++)
System.out.print(--ch);
System.out.println();
for(i=n-1;i>=1;i--)
{
ch='a';
for(j=1;j<=i;j++)
System.out.print(ch++);
for(k=1;k<=c;k++)
System.out.print(" ");
for(j=1;j<=i;j++)
System.out.print(--ch);
System.out.println();
c=c+2;
}
c=c-4;
for(i=2;i<n;i++)
{
ch='a';
for(j=1;j<=i;j++)
System.out.print(ch++);
for(k=1;k<=c;k++)
System.out.print(" ");
for(j=1;j<=i;j++)
System.out.print(--ch);
System.out.println();
c=c-2;
}
ch='a';
for(i=1;i<=n;i++)
System.out.print(ch++);
--ch;
for(i=1;i<n;i++)
System.out.print(--ch);
}
}