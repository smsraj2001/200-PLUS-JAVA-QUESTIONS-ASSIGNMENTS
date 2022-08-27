/**Write a program to find number of occurances of word n the sentence.*/

import java.util.*;
public class EXAMPLE_162
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence:-");
String S=sc.nextLine(),S1="";
System.out.println("Enter a word to be searched for:-");
String W=sc.next();
int l=S.length(),index=0,count=0,c=0;
S=S+" ";
for(int i=0;i<=l;i++)
{
if(S.charAt(i)==' ')
{
S1=S.substring(index,i);
if(S1.equalsIgnoreCase(W))
count=count+1;
index=i+1;
}
}
if(count>0)
System.out.println(W+" occurs "+count+" times in the sentence.");
else
System.out.println(W+" is not found in the sentence.");
}
}