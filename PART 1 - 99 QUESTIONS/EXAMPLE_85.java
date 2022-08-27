/**Write a program to convert characters to lowercase and if the String has vowels , it should print 
the next character
INPUT : Computer
OUTPUT : cpmvtfr    */

import java.util.*;
public class EXAMPLE_85
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:-");
String S=sc.next();
int l=S.length();
S=S.toLowerCase();
System.out.println(S);
String p="",n="";
char ch1='0';
for(int i=0;i<l;i++)
{
char ch=S.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
ch1=(char)(ch+1);
S=S.replace(ch,ch1);;
}
}
System.out.println(S);
}
}