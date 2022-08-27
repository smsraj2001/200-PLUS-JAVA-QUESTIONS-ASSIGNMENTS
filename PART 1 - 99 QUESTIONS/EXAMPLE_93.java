/**Write a program to check whether a string is a palindrome or not:-*/

import java.util.*;
public class EXAMPLE_93
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
System.out.println("Reversed string : "+p);
if(S.equals(p))
System.out.println(S+" is a palindrome.");
else if(S.equalsIgnoreCase(p))
System.out.println(S+" is a palindrome if case is ignored.");
else
System.out.println(S+" is not a palindrome.");
}
}   