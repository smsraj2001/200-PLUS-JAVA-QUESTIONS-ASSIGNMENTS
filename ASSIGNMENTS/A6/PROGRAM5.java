/**Write a program to count the number of uppercase,lowercase and digits in a string.*/

import java.util.*;
public class PROGRAM5
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:-");
String S=sc.next();
int l=S.length();
int c1=0,c2=0,c3=0,c4=0;
for(int i=0;i<l;i++)
{
char ch=S.charAt(i);
if(ch>='A'&&ch<='Z')
c1++;
else if(ch>='a'&&ch<='z')
c2++;
else if(ch>='1'&&ch<='9')
c3++;
else
c4++;
}
System.out.println("Number of upper case letters : "+c1+".");
System.out.println("Number of lower case letters : "+c2+".");
System.out.println("Number of digits : "+c3+".");
System.out.println("Number of special characters : "+c4+".");
}
}