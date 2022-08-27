/**Write a program to input few Strings and arrange the strings in the ascending order using selection
sorting technique.*/

import java.util.*;
public class PROGRAM8
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array:-");
int n=sc.nextInt();
int i,j,pos;
String a[]=new String[n],temp,small;
System.out.println("Enter the elements of the array:-");
for(i=0;i<n;i++)
a[i]=sc.next();
for(i=0;i<n;i++)
{
small=a[i];
pos=i;
for(j=i+1;j<n;j++)
{
if(small.compareTo(a[j])>0)
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