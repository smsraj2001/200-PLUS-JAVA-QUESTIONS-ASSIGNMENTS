/**Write a program to check if a string is special String or not.*/

import java.util.*;
public class EXAMPLE_169
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String:-");
String S=sc.next();
int l=S.length(),c=0,d=0;
String S1=S.toUpperCase(),Mes="";
for(int i=0;i<l;i++)
{
char ch1=S1.charAt(i);
for(int j=0;j<l;j++)
{
char ch2=S1.charAt(j);
if(ch1==ch2)
{
c++;
}
}
d=d+c;
if(d==l)
Mes=" is a Special string.";
else
Mes=" is not a Special string.";
c=0;
}
System.out.println(S+Mes);
}
}