/**Write a program to convert a sentence to a toggle case:-*/

import java.util.*;
public class EXAMPLE_94
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence in uppercase:-");
String S=sc.nextLine();
S=S.toUpperCase();
System.out.println(S);
int l=S.length();
String p="";
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
System.out.println(p);
}
}