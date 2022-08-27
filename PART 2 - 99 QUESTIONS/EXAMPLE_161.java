/**Wriite a program to count number of vowels in a string using multiple switch case.*/

import java.util.*;
public class EXAMPLE_161
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sring:-");
String S=sc.nextLine();
int l=S.length(),count=0;
for(int i=0;i<l;i++)
{
char ch=S.charAt(i);
switch(ch)
{
case 'A' :
case 'a' :
case 'E' :
case 'e' :
case 'I' :
case 'i' :
case 'O' :
case 'o' :
case 'U' :
case 'u' :
count++;
}
}
System.out.println("The number of vowels in "+S+" is "+count+".");
}
}