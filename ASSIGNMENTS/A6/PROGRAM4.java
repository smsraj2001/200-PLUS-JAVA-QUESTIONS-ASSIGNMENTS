/**Write a program to convert a string to toggle case.*/

import java.util.*;
public class PROGRAM4
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:-");
String S=sc.next();
int l=S.length();
String p="";
S=S.toUpperCase();
for(int i=0;i<l;i++)
{
char ch=S.charAt(i);
if(i%2!=0)
{
ch=Character.toLowerCase(ch);
p=p+ch;
}
else
p=p+ch;
}
System.out.println("The string in the toggle case is "+p+".");
}
}