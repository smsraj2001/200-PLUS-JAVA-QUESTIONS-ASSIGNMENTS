/**Write a program to square an even number and to cube an odd number in an array.*/ 

import java.util.*;
public class EXAMPLE_198
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array:-");
int l=sc.nextInt(),i=0;
long a[]=new long[l];
long b[]=new long[l];
System.out.println("Enter the numbers:-");
for(i=0;i<l;i++)
a[i]=sc.nextLong();
for(i=0;i<l;i++)
{
if(a[i]%2==0)
b[i]=a[i]*a[i];
else if(a[i]%2==1)
b[i]=a[i]*a[i]*a[i];
}
System.out.println("The resultant array is :-");
for(i=0;i<l;i++)
System.out.println(b[i]);
}
}