/**Write a program to print the pyramid pattern of stars.*/

import java.util.*;
public class EXAMPLE_221
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n:-");
int n=sc.nextInt();
int c=n-1;
for(int i=1;i<=n;i++)
{
for(int k=1;k<=c;k++)
System.out.print(" ");
for(int j=1;j<=i;j++)
System.out.print(" *");
System.out.println();
c=c-1;
}
}
}