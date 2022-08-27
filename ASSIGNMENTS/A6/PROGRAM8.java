/**Write a program to display the first letter of each word.
INPUT : Mohandas Karamchand Gandhi             
OUTPUT : M.K.G.             */

import java.util.*;
public class PROGRAM8
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:-");
String S=sc.nextLine();
int l=S.length();
System.out.print(S.charAt(0)+".");
//Printing first letter of first word.
for(int i=0;i<l;i++)
{
char ch=S.charAt(i);
if(ch==' ')
{
int j=i+1;
char t=S.charAt(j);
//t=Character.toUpperCase(t);
System.out.print(t+".");
}
}
}
}