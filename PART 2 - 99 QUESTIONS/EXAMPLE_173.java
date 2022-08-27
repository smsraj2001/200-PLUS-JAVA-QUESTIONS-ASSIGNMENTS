/**Write a program to accept a string and display the string after removing the vowels.*/

import java.util.*;
public class EXAMPLE_173
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence:-");
String S=sc.nextLine();
int l=S.length();
String p="";
for(int i=0;i<l;i++)
{
char ch=S.charAt(i);
if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
p=p+"";
}
else
p=p+ch;
}
System.out.println(p);
}
}