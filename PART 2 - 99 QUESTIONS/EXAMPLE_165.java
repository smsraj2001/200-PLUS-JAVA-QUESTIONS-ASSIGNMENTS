/**Write a program to accept a string and print the word having atleast 1 consecutive letters.*/ 

import java.util.*;
public class EXAMPLE_165
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence:-");
String S=sc.nextLine().toUpperCase(),S2=" ",S3=" ",p="";
S=S+" ";
int l=S.length(),c=0,index=0;
for(int i=0;i<l;i++)
{
if(S.charAt(i)==' ')
{
S2=S.substring(index,i);
for(int j=0;j<S2.length()-1;j++)
{
char ch1=S2.charAt(j);
char ch2=S2.charAt(j+1);
if(ch2==(char)ch1+1)
{
S3=S2;
p=S3;
System.out.println(p);
break;
}
}
index=i+1;
}
}
}
} 