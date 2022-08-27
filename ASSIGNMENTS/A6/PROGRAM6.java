/**Write a program to display all the vowels in a string.
INPUT : Welcome
OUTPUT : e,o,e       */

import java.util.*;
public class PROGRAM6
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:-");
String S=sc.next();
int l=S.length();
System.out.println("The vowel/vowels are :-");
for(int i=0;i<l;i++)
{
char ch=S.charAt(i);
if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
System.out.print(ch+",");
}
}
}