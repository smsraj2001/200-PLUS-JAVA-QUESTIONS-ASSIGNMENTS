/**Write a progrm that encodes a word into Piglatin.To translate a word into a Piglatin word,convert
the word into uppercase and then place the first vowel of the original word as the start of the new 
word along with the remaining alphabets.The alphabets present before the vowel being shifted towards
the end followed by "AY":-
.1.INPUT : London                  OUTPUT : ONDONLAY
.2.INPUT : Olympics                OUTPUT : OLYMPICSAY         */

import java.util.*;
public class EXAMPLE_90
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:-");
String S=sc.next();
S=S.toUpperCase();
System.out.println(S);
int l=S.length();
String p="";
String S1="",S2="";
for(int i=0;i<l;i++)
{
char ch=S.charAt(i);
if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
S2=S.substring(0,i);
S1=S.substring(i,l);
p=S1+S2+"AY";
break;
}
else
{
p=S+"AY";
}
}
System.out.println(p);
}
}