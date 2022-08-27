/**Write a program for labelled loop.*/

import java.util.*;
public class EXAMPLE_218
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value for rows:-");
int m=sc.nextInt();
System.out.println("Enter the value for columns:-");
int n=sc.nextInt();
int i=0,j=0;
outer:
for(i=0;i<m;i++)
{
inner:
for(j=0;j<n;j++)
{
if(i>j)
{
System.out.println(i + " > " + j);
break outer;
}
else
if(i==j)
break inner;
}
}
}
}