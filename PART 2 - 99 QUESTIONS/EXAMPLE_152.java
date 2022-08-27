/**Write a program to count the occurances of a word in a sentence.*/

import java.util.*;
public class EXAMPLE_152
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence:-");
String S=sc.nextLine();
S=S+" ";
System.out.println("Enter a word to be searched for:-");
String S2=sc.next();
int l=S.length(),index=0,count=0;
String S1="";
for(int i=0;i<l;i++)
{
if(S.charAt(i)==' ')
{
S1=S.substring(index,i);
if(S1.equalsIgnoreCase(S2))
count=count+1;
index=i+1;
}
}
System.out.println("String "+S2+" occurs "+count+" times in the sentence.");
}   
}