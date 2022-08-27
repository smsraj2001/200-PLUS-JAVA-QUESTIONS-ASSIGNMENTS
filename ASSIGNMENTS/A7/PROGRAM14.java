/**Write a program to accept 10 elements each in two arrays and then add it to produce third array.*/

import java.util.*;
public class PROGRAM14
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int i,j;
int A[]=new int[10],B[]=new int[10],C[]=new int[20];
System.out.println("Enter the elements of the first array:-");
for(i=0;i<10;i++)
A[i]=sc.nextInt();
System.out.println("Enter the elements of the second array:-");
for(j=0;j<10;j++)
B[j]=sc.nextInt();
for(i=0;i<10;i++)
C[i]=A[i];
for(j=0;j<10;j++)
{
C[i]=B[j];
i=i+1;
}
System.out.println("The mergerd array is :-");
for(i=0;i<20;i++)
System.out.println(C[i]);
}
}