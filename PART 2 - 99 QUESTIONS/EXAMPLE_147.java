/**Write a program to reverse an array(string).*/

import java.util.*;
public class EXAMPLE_147
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array:-");
int n=sc.nextInt();
System.out.println("Enter the elements of the array:-");
String a[]=new String[n];
int i,j;
for(i=0;i<n;i++)
a[i]=sc.next();
System.out.println("The reversed array is:-");
for(j=n-1;j>=0;j--)
{
System.out.println(a[j]);
}
}
}