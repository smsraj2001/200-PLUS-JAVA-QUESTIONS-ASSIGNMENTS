/**Write a program to input few numbers and arrange the numbers in the ascending order using selection
sorting technique.*/

import java.util.*;
public class EXAMPLE_114
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array:-");
int n=sc.nextInt();
int i,j,a[]=new int[n],temp,small,pos;
System.out.println("Enter the elements of the array:-");
for(i=0;i<n;i++)
a[i]=sc.nextInt();
for(i=0;i<n;i++)
{
small=a[i];
pos=i;
for(j=i+1;j<n;j++)
{
if(small>a[j])
{
small=a[j];
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