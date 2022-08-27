/**Write a program to accept two arrays and merge and display the mergerd array.[Using int numbers].*/

import java.util.*;
public class EXAMPLE_124
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the first array:-");
int L1=sc.nextInt();
System.out.println("Enter the size of the second array:-");
int L2=sc.nextInt();
int L3=L1+L2,i,j;
int A[]=new int[L1],B[]=new int[L2],C[]=new int[L3];
System.out.println("Enter the elements of the first array:-");
for(i=0;i<L1;i++)
A[i]=sc.nextInt();
System.out.println("Enter the elements of the second array:-");
for(j=0;j<L2;j++)
B[j]=sc.nextInt();
for(i=0;i<L1;i++)
C[i]=A[i];
for(j=0;j<L2;j++)
{
C[i]=B[j];
i=i+1;
}
System.out.println("The mergerd array is :-");
for(i=0;i<L3;i++)
System.out.println(C[i]);
}
}