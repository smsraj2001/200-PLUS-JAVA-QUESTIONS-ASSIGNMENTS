/**Write a program to reverse an array(number).*/

import java.util.*;
public class EXAMPLE_146
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array:-");
int n=sc.nextInt();
System.out.println("Enter the elements of the array:-");
int a[]=new int[n],i,j;
for(i=0;i<n;i++)
a[i]=sc.nextInt();
System.out.println("The reversed array is:-");
for(j=n-1;j>=0;j--)
{
System.out.println(a[j]);
}
}
}