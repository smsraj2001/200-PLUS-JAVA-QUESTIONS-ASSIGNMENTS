/**Write a program to take input and display elements of 2D array.*/

import java.util.*;
public class EXAMPLE_223
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows:-");
int r=sc.nextInt();
System.out.println("Enter the number of columns:-");
int c=sc.nextInt();
int a[][]=new int[r][c];
int i,j;
System.out.println("Enter the elements of the array:-");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("The elements are:-");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}