/**Write a program to input few numbers and arrange the numbers in the descending order using selection
sorting technique.*/

import java.util.*;
public class PROGRAM7
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array:-");
int n=sc.nextInt();
int i,j,a[]=new int[n],temp,large,pos;
System.out.println("Enter the elements of the array:-");
for(i=0;i<n;i++)
a[i]=sc.nextInt();
for(i=0;i<n;i++)
{
large=a[i];
pos=i;
for(j=i+1;j<n;j++)
{
if(large<a[j])
{
large=a[j];
pos=j;
}
}
temp=a[i];
a[i]=a[pos];
a[pos]=temp;
}
System.out.println("The result of the sorted array is:-");
for(i=0;i<n;i++)
System.out.println(a[i]);
}
}