/**Write a program to display a string and its ASCII code:-
INPUT : ABC
OUTPUT : 656667       */

import java.util.*;
public class PROGRAM13
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:-");
String S=sc.next();
int l=S.length();
String p="";
for(int i=0;i<l;i++)
{
char ch=S.charAt(i);
int ASCII=ch;
p=(String)p+ASCII;
}
System.out.println("The ASCII code of the string is "+p+".");
}
}