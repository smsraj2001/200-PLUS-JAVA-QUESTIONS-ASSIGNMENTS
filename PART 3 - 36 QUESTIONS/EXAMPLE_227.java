/**Write a program to find the transpose of a matrix.*/

import java.util.*;
public class EXAMPLE_227
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows:-");
int r=sc.nextInt();
System.out.println("Enter the number of columns:-");
int c=sc.nextInt();
int a[][]=new int[r][c];
int t[][]=new int[c][r];
int i,j;
System.out.println("Enter the elements of the array:-");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("The elements before transpose are:-");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
System.out.println("The elements after transpose are:-");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
t[j][i]=a[i][j];
}
}
for(i=0;i<c;i++)
{
for(j=0;j<r;j++)
{
System.out.print(t[i][j]+" ");
}
System.out.println();
}
}
}