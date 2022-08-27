/**Write a program that takes an integer argument and prints the following pattern,shown for
n=4.
1
121
12321
1234321
12321
121
1                               */

import java.util.*;
public class PROGRAM5
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter '4' to obtain the pattern given in question.");
System.out.println("The pattern is :-");
int n=sc.nextInt();
int i,j,k;
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
 System.out.print(j);
}
for(k=i-1;k>=1;k--)
{
System.out.print(k);
}
System.out.println();
}
for(i=n-1;i>=1;i--)
{
for(j=1;j<=i;j++)
{
System.out.print(j);
}
for(k=i-1;k>=1;k--)
{
System.out.print(k);
}
System.out.println();
}
}
}