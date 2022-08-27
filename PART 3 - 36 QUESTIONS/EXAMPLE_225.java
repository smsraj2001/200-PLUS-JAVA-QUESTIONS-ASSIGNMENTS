/**Write a program to add two matrices.*/

import java.util.*;
public class EXAMPLE_225
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows for first matrix:-");
int r1=sc.nextInt();
System.out.println("Enter the number of columns for first matrix:-");
int c1=sc.nextInt();
int a[][]=new int[r1][c1];
System.out.println("Enter the number of rows for second matrix:-");
int r2=sc.nextInt();
System.out.println("Enter the number of columns for second matrix:-");
int c2=sc.nextInt();
int b[][]=new int[r2][c2];
if(r1==r2&&c1==c2)
System.out.println("The sum is:-");
else
{
System.out.println("Either the number of rows or columns or both of the array should be equal.");
System.out.println("Try again....");
System.exit(0);
}
int i,j,c[][]=new int[r1][c1];
System.out.println("Enter the elements of the first array array:-");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("Enter the elements of the second array array:-");
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
b[i][j]=sc.nextInt();
}
}
System.out.println("The sum of two matrices are :-");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
System.out.println("FIRST MATRIX");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
System.out.println("SECOND MATRIX");
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
System.out.print(b[i][j]+" ");
}
System.out.println();
}
System.out.println("RESULTANT MATRIX");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}