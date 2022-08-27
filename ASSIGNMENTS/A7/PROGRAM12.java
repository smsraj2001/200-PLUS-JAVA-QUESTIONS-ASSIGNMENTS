/**Write a program to input few numbers in an array and search a number using binary search.*/

import java.util.*;
public class PROGRAM12
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array:-");
int l=sc.nextInt();
int pos=0;
//Assuming array is sorted.
int a[]=new int[l],i,found=0,L=0,U=0,M=0;
//int j,temp;
System.out.println("Enter the elements of the array:-");
for(i=0;i<a.length;i++)
a[i]=sc.nextInt();
/**for(i=0;i<l;i++)
{
for(j=i+1;j<l;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("The result of the sorted array if not sorted is:-");
for(i=0;i<l;i++)
System.out.println(a[i]);   */
System.out.println("Enter a number to be searched:-");
int n=sc.nextInt();
L=0;
U=l-1;
while(L<=U)
{
M=(L+U)/2;
if(n>a[M])
L=M+1;
else if(n<a[M])
U=M-1;
else
{
found=1;
pos=M+1;
break;
}
}
if(found==1)
System.out.println(n+" exists in the array in the position "+pos+".");
else
System.out.println(n+" does not exists in the array.");
}
}