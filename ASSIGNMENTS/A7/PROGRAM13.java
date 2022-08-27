/**Write a program to input few strings in an array and search a String using binary search.*/

import java.util.*;
public class PROGRAM13
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array:-");
int l=sc.nextInt();
int pos=0;
//Assuming array is sorted.
String a[]=new String[l];
int i,found=0,L=0,U=0,M=0;
//String temp;
//int j;
System.out.println("Enter the elements of the array:-");
for(i=0;i<a.length;i++)
a[i]=sc.next();
/**for(i=0;i<l;i++)
{
for(j=i+1;j<l;j++)
{
if(a[i].compareTo(a[j])>0)
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("The result of the sorted array if not sorted is:-");
for(i=0;i<l;i++)
System.out.println(a[i]); */  
System.out.println("Enter a String to be searched:-");
String n=sc.next();
L=0;
U=l-1;
while(L<=U)
{
M=(L+U)/2;
if(n.compareTo(a[M])>0)
L=M+1;
else if(n.compareTo(a[M])<0)
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