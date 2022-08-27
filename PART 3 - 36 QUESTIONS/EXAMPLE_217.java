/**Write a program to merge and split arrays.*/

import java.util.*;
public class EXAMPLE_217
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println(".1. Enter 1 for splitting arrays.");
System.out.println(".2. Enter 2 for merging 2 arrays.");
System.out.println("Enter your choice:-");
int ch=sc.nextInt();
switch(ch)
{
case 1 :
Split();
break;
case 2 :
Merge();
break;
default :
System.out.println("Wrong choice.");
break;
}
}
public static void Split()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array:-");
int l=sc.nextInt();
System.out.println("Out of "+l+" numbers, how many you want in first array:-");
int split =sc.nextInt();
int C[]=new int[l],A[]=new int[split],B[]=new int[l-split];
System.out.println("Enter "+l+" elements in the array:-");
for(int i=0;i<l;i++)
C[i]=sc.nextInt();
System.out.println("The first array is:-");
int k=0;
for(int i=0;i<split;i++)
{
A[i]=C[k];
k++;
}
for(int i=0;i<split;i++)
System.out.println(A[i]);
System.out.println("The second array is:-");
for(int j=0;j<B.length;j++)
{
B[j]=C[k];
k++;
}
for(int i=0;i<B.length;i++)
System.out.println(B[i]);
}
public static void Merge()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of first array:-");
int l1=sc.nextInt();
System.out.println("Enter the size of second array:-");
int l2=sc.nextInt();
System.out.println("Enter "+l1+" numbers for first array:-");
int A[]=new int[l1],B[]=new int[l2],C[]=new int[l1+l2];
for(int i=0;i<l1;i++)
A[i]=sc.nextInt();
System.out.println("Enter "+l2+" numbers for second array:-");
for(int i=0;i<l2;i++)
B[i]=sc.nextInt();
int k=0;
System.out.println("The merged array is:-");
for(int i=0;i<l1;i++)
{
C[k]=A[i];
k++;
}
for(int j=0;j<l2;j++)
{
C[k]=B[j];
k++;
}
for(k=0;k<l1+l2;k++)
System.out.println(C[k]);
}
}