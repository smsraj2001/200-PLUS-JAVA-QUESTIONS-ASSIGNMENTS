/**Write a program to repalce all the vowels in a word with x
INPUT : Hello
OUTPUT : Hxllx                  */

import java.util.*;
public class PROGRAM11
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:-");
String S=sc.next();
int l=S.length();
for(int i=0;i<l;i++)
{
char ch=S.charAt(i);
if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
S=S.replace(ch,'x');
}
}
System.out.println("The sorted string is "+S);
}
}