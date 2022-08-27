/**Write a program to accept a string and print the word having atleast 1 consecutive letters using Snanner
class functions.*/ 

import java.util.*;
public class EXAMPLE_178
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence:-");
String S=sc.nextLine();
sc=new Scanner(S);
int found=0;
String y="";
while(sc.hasNext())
{
String x=sc.next();
for(int i=0;i<x.length()-1;i++)
{
char ch1=x.charAt(i);
char ch2=x.charAt(i+1);
if((char)ch2==(char)ch1+1)
{
found=1;
y=x;
System.out.println(y);
}
}
}
}
}

