/**Write a program to input student's name and to search a name with his UID Number.*/

import java.util.*;
public class EXAMPLE_155
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of the students:-");
int n=sc.nextInt();
String S[]=new String[n],temp="";
int ID[]=new int[n],found=0,i,j,temp$=0;
System.out.println("Enter the names of the students.");
for(i=0;i<n;i++)
S[i]=sc.next();
System.out.println("Enter the corresponding ID number.");
for(i=0;i<n;i++)
ID[i]=sc.nextInt();
System.out.println("Enter the name to searched.");
String name=sc.next();
for(i=0;i<n;i++)
{
if(name.equalsIgnoreCase(S[i]))
{
found=1;
System.out.println("----------------------------------------------");
System.out.println("NAME                      ROLL_NO");
System.out.println(S[i]+"                 "+ID[i]);
System.out.println("----------------------------------------------");
break;
}
}
System.out.println("The sorted names are:-");
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(S[i].compareTo(S[j])>0)
{
temp=S[i];
S[i]=S[j];
S[j]=temp;
}
}
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(ID[i]>ID[j])
{
temp$=ID[i];
ID[i]=ID[j];
ID[j]=temp$;
}
}
}
for(i=0;i<n;i++)
System.out.println(S[i]);
}
}