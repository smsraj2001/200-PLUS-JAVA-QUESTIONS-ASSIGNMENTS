/**Write a program for the encodement of the string:-*/

import java.util.*;
public class EXAMPLE_176
{
public static void Encode1()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a word in Uppercase:-");
String S=sc.next().toUpperCase();
int l=S.length();
String p="";
for(int i=0;i<l;i++)
{
char ch=S.charAt(i);
if(ch=='Y')
p=p+'A';
else if(ch=='Z')
p=p+'B';
else
p=p+(char)(ch+2);
}
System.out.println(p+"\n");
}
public static void Encode2()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a word in Uppercase:-");
String S=sc.next().toUpperCase();
int l=S.length();
String p="";
for(int i=0;i<l;i++)
{
char ch=S.charAt(i);
if(ch=='A')
p=p+'X';
else if(ch=='B')
p=p+'Y';
else if(ch=='C')
p=p+'Z';
else
p=p+(char)(ch-3);
}
System.out.println(p);
}
public static void main(String[]args)
{
Encode1();
Encode2();
System.out.println("End of the program.");
System.exit(0);
}
}