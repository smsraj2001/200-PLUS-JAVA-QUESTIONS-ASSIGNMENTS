/**PATTERN PROGRAMS.*/

import java.util.*;
public class EXAMPLE_92
{
public static void P1()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of the loop:-");
int n=sc.nextInt();
int i=0,j=0;
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
if(j%2!=0)
System.out.print(" "+"*");
else
System.out.print(" "+"#"); 
}
System.out.println();
}
}
public static void P2()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of the loop:-");
int n=sc.nextInt();
for(int i=n;i>=0;i--)
{
for(int j=i;j>0;j--)
{
System.out.print(i+" ");
}
System.out.println();
}
}
public static void main(String[]args)
{
P1();
P2();
}
}



