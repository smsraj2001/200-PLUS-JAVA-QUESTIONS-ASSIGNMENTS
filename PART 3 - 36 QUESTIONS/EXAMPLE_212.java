/**Write an array program to accept numbers and display only the prime numbers.*/

import java.util.*;
public class EXAMPLE_212
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array:-");
int l=sc.nextInt();
int a[]=new int[l],c=0;
System.out.println("Enter "+l+" numbers:-");
for(int i=0;i<l;i++)
{
a[i]=sc.nextInt();
}
System.out.println("The prime numbers are:-");
for(int i=0;i<l;i++)
{
for(int j=1;j<=a[i];j++)
{
if(a[i]%j==0)
c++;
}
if(c==2)
System.out.println("The prime number is "+a[i]+".");
c=0;
}
}
}