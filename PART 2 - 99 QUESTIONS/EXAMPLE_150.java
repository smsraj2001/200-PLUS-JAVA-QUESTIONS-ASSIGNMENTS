/**Write a program to find the longest and smallest words in a sentence.*/

import java.util.*;
public class EXAMPLE_150
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence:-");
String S=sc.nextLine();
S=S+" ";
String S2="",MAS="",MIS="";
int l=S.length();
int index=0,max=0,min=S.length(),c1=0,c2=0,c3=0,c4=0,c5=0,count=0;
for(int i=0;i<l;i++)
{
char ch=S.charAt(i);
if(ch==' ')
{
S2=S.substring(index,i);
count=count+1;
if(S2.length()>max)
{
max=S2.length();
MAS=S2;
}
if(S2.length()<min)
{
min=S2.length();
MIS=S2;
}
index=i+1;
}
}
for(int i=0;i<l;i++)
{
char ch=S.charAt(i);
if(ch>='A'&&ch<='Z')
c1++;
else if(ch>='a'&&ch<='z')
c2++;
else if(ch>='0'&&ch<='9')
c3++;
else if(ch==' ')
c4++;
else
c5++;
}
System.out.println("Longest String (word) is "+MAS+".");
System.out.println("Length of Longest String (word) is "+max+".");
System.out.println("Smallest String (word) is "+MIS+".");
System.out.println("Length of Smallest String (word) is "+min+".");
System.out.println("Number of UPPERCASE Characters : "+c1+".");
System.out.println("Number of LOWERCASE Characters : "+c2+".");
System.out.println("Number of Digits : "+c3+".");
System.out.println("Number of spaces : "+c4+".");
System.out.println("Number of Special Characters : "+c5+".");
System.out.println("Number of words : "+count+".");
}
}