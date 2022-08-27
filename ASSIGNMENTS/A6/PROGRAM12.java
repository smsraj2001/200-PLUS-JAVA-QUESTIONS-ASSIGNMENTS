/**Write a program to check if a string is a palindrome:-*/               

import java.util.*;
public class PROGRAM12
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:-");
String S=sc.next();
int l=S.length();
String p="";
for(int i=l-1;i>=0;i--)
{
char ch=S.charAt(i);
p=p+ch;
}
if(p.equalsIgnoreCase(S))
System.out.println(S+" is a palindrome.");
else
System.out.println(S+" is not a palindrome.");
}
}