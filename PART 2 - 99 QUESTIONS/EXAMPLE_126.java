/**Write a program to find the smallest and largest element in an array.*/

import java.util.*;
public class EXAMPLE_126
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array:-");
int n=sc.nextInt();
int i,j,a[]=new int[n],temp;
System.out.println("Enter the elements of the array:-");
for(i=0;i<n;i++)
a[i]=sc.nextInt();
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("The Smallest number in the array is "+a[0]+".");
System.out.println("The Largest number in the array is "+a[n-1]+".");
}
}