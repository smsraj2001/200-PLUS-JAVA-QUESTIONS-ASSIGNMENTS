/**Write a program to do a code word.*/

import java.util.*;
public class EXAMPLE_208
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a word:-");
String S=sc.nextLine().toLowerCase();
int l=S.length();
String p="";
for(int i=0;i<l;i++)
{
char ch=S.charAt(i);
if(ch=='z')
p=p+'a';
else
p=p+(char)(ch+1);
}
System.out.println("The resulting string is "+p+".");
}
}