/**Write a program to take input and display elements of 2D array and to search an element.*/

import java.util.*;
public class EXAMPLE_224
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows:-");
int r=sc.nextInt();
System.out.println("Enter the number of columns:-");
int c=sc.nextInt();
int a[][]=new int[r][c];
int i,j,found=0,p1=0,p2=0,n;
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
System.out.println("Enter the search element:-");
n=sc.nextInt();
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(a[i][j]==n)
{
p1=i+1;
p2=j+1;
found=1;
break;
}
}
}
if(found==1)
System.out.println(n+" exists in the array in the ROW : "+p1+" and in the COLUMN : "+p2+".");
else
System.out.println("Sorry... "+n+" does not exist in the array.");
}
}