/**Write a program to input few Strings and arrange the strings in the descending order using bubble
sorting technique.*/

import java.util.*;
public class PROGRAM5
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array:-");
int n=sc.nextInt();
int i,j;
String a[]=new String[n],temp;
System.out.println("Enter the elements of the array:-");
for(i=0;i<n;i++)
a[i]=sc.next();
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i].compareTo(a[j])<0)
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("The result of the sorted array is:-");
for(i=0;i<n;i++)
System.out.println(a[i]);
}
}