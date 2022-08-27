/**Write a program to input few strings in the array and search a String using linear search.*/

import java.util.*;
public class PROGRAM11
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array:-");
int l=sc.nextInt(),i,found=0;
String a[]=new String[l];
System.out.println("Enter the elements of the array:-");
for(i=0;i<a.length;i++)
a[i]=sc.next();
System.out.println("Enter a String to be searched:-");
String n=sc.next();
for(i=0;i<a.length;i++)
{
if(a[i].equalsIgnoreCase(n))
{
found=1;
break;
}
}
if(found==1)
System.out.println(n+" exists in the array.");
else
System.out.println(n+" does not exists in the array.");
}
}