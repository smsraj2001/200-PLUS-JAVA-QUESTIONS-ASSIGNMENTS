/**Write a program to check whether a number is a duck number or not.*/

import java.util.*;
public class EXAMPLE_197
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:-");
int n=sc.nextInt();
String S=Integer.toString(n),mes="";
int l=S.length();
for(int i=0;i<l;i++)
{
char ch=S.charAt(i);
if(ch=='0')
{
mes=" is a duck number.";
break;
}
else
mes=" is not a duck number.";
}
System.out.println(n+mes);
}
}