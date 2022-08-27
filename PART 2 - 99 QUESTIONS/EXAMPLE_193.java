/**Write a program to arrange the words of the sentence in ascending order.*/

import java.util.*;
public class EXAMPLE_193
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of words in the sentence:-");
int n=sc.nextInt();
int i,j;
String a[]=new String[n],temp;
System.out.println("Enter the elements of the array:-");
for(i=0;i<n;i++)
a[i]=sc.next().toUpperCase();
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i].compareTo(a[j])>0)
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("The result of the ascending sentence is:-");
for(i=0;i<n;i++)
System.out.print(a[i]+" ");
}
}