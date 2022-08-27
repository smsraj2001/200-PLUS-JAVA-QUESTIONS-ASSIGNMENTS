/**Write a program to find a word and write how many times it occurs in a program:-*/

import java.util.*;
public class EXAMPLE_86
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence:-");
String S=sc.nextLine();
int l=S.length();
System.out.println("Enter the word to be searched:-");
String W=sc.next();
String n=" ";
int count=0;
int sp=0;
String S1=S+"";
for(int i=0;i<l;i++)
{
char ch=S1.charAt(i);
if(ch==' ')
{
n=S.substring(sp,i);
sp=i+1;
if(n.equalsIgnoreCase(W))
{
count++;
}
}
}
System.out.println("The word "+W+" occurs "+ ++count+" times in "+S+".");
}
}    