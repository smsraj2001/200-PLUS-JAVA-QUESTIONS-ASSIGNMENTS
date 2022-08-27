/**Write a program to input few numbers in the array and search a number using linear search.*/

import java.util.*;
public class PROGRAM10
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array:-");
int l=sc.nextInt();
int a[]=new int[l],i;
System.out.println("Enter the elements of the array:-");
for(i=0;i<a.length;i++)
a[i]=sc.nextInt();
System.out.println("Enter a number to be searched:-");
int n=sc.nextInt(),found=0;
for(i=0;i<a.length;i++)
{
if(a[i]==n)
{
found=1;
break;
}
}
if(found==1)
System.out.println(n+" exists in the array.");
else
System.out.println(n+" does not exists in the array.");
}
}