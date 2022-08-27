/**Write a program to count the occurances of each element of the array.*/

import java.util.*;
public class EXAMPLE_200
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array:-");
int l=sc.nextInt(),i,j;
System.out.println("Now please enter the elements of the array(Strings):-");
String a[]=new String[l];
for(i=0;i<l;i++)
a[i]=sc.next();
int a1=0,k=1;
System.out.println("ELEMENTS \t FREQUENCY");
for(i=0;i<l;i++)
{
a1=0;
k=1;
for(j=0;j<l;j++)
{
if(j>=i)
{
if(a[i].equalsIgnoreCase(a[j])&&(j!=i))
k++;
}
else if(a[i].equalsIgnoreCase(a[j]))
a1=1;
}
if(a1!=1)
System.out.println(a[i]+"\t\t\t"+k);
}
}
}