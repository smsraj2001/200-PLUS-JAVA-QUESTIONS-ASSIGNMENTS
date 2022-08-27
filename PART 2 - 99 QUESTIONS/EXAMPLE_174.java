/**Write a program to extract a word from a sentence using Scanner class functions.*/

import java.util.*;
public class EXAMPLE_174
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence:-");
String S=sc.nextLine(),maxstr="",minstr="";
Scanner sc1=new Scanner(S);
int count =0,max=0,l=0,min=S.length();
while(sc1.hasNext())
{
String x=sc1.next();
count=count+1;
System.out.println(x);
l=x.length();
if(l>max)
{
max=l;
maxstr=x;
}
if(l<min)
{
min=l;
minstr=x;
}
}
System.out.println("LONGEST WORD : "+maxstr+".");
System.out.println("LENGTH OF LONGEST WORD : "+max+".");
System.out.println("SHORTEST WORD : "+minstr+".");
System.out.println("LENGTH OF SHORTEST WORD : "+min+".");
System.out.println("There are "+count+" word/s in the sentence.");
}
}