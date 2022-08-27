/**Write a program to find the longest word in the sentence.*/

import java.util.*;
public class PROGRAM14
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
String S1,S2=" ",max_str=" ";
int index=0,max=0;
System.out.println("Enter a string or a sentence:-");
S1=sc.nextLine();
S1=S1+" ";
for(int i=0;i<S1.length();i++)
{
if(S1.charAt(i)==' ')
{
S2=S1.substring(index,i);
System.out.println(S2);
if(S2.length()>max)
{
max=S2.length();
max_str=S2;
}
index=i+1;
}
}
System.out.println("The length of the longest word is "+max+".");
System.out.println("The longest word is "+max_str+".");
}
}