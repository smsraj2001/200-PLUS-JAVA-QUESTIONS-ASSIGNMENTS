/**An example for 2 dimensional array.*/

import java.util.*;
public class EXAMPLE_111
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size for rows:-");
int rows=sc.nextInt();
System.out.println("Enter the size for columns:-");
int col=sc.nextInt();
int a[][]=new int[rows][col],i,j;
System.out.println("Enter the elements:-");
for(i=0;i<rows;i++)
{
for(j=0;j<col;j++)
{
a[i][j]=sc.nextInt();
}
}
for(i=0;i<rows;i++)
{
for(j=0;j<col;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
}
}