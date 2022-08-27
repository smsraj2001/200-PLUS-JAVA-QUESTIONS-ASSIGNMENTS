/**Write a program to accept 20 elements and store 5 elements in the second array and the rest in the
third array.   */

import java.util.*;
public class PROGRAM1
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 20 numbers in the array:-");
int c[]=new int[20],i,j,k=0;
int a[]=new int[5],b[]=new int[15];
for(i=0;i<20;i++)
c[i]=sc.nextInt();
System.out.println("The first array is :-");
for(i=0;i<a.length;i++)
{
a[i]=c[k];
k++;
System.out.println(a[i]);
}
System.out.println("The second array is :-");
for(j=0;j<b.length;j++)
{
b[j]=c[k];
k++;
System.out.println(b[j]);
}
}
}
/**
 * 1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
*/