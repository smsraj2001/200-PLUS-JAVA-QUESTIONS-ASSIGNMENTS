/**Write a program to accept few numbers in an array and print the even and odd numbers.*/

import java.util.*;
public class EXAMPLE_127
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array:-");
int L=sc.nextInt();
int a[]=new int[L];
System.out.println("Enter the elements of the array:-");
for(int i=0;i<L;i++)
a[i]=sc.nextInt();
System.out.println("The even numbers are:-");
for(int i=0;i<L;i++)
{
if(a[i]%2==0)
System.out.println(a[i]);
}
System.out.println("The odd numbers are:-");
for(int i=0;i<L;i++)
{
if(a[i]%2!=0)
System.out.println(a[i]);
}
}
}