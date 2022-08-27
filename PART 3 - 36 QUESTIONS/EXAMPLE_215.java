/**Write a program to reverse the sentence but not the words.*/

import java.util.*;
public class EXAMPLE_215
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence:-");
String S=sc.nextLine();
String p="",x="",y="";
for(int k=S.length()-1;k>=0;k--)
{
char ch=S.charAt(k);
p=p+ch;
}
p=p+" ";
int index=0;
for(int i=0;i<p.length();i++)
{
if(p.charAt(i)==' ')
{
x=p.substring(index,i);
for(int j=x.length()-1;j>=0;j--)
{
char ch2=x.charAt(j);
y=y+ch2;
}
System.out.print(y+" ");
y="";
index=i+1;
}
}
}
}