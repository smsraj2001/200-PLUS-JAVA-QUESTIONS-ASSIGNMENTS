/**Write a program to count the number of repititive letters.
INPUT : MISSISSIPPI
OUTPUT : 3                  */

import java.util.*;
public class PROGRAM9
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:-");
String S=sc.nextLine();
int l=S.length();
char c,d;
int count=0;
for(int i=0;i<l-1;i++)
{
c=S.charAt(i);
d=S.charAt(i+1);
if(c==d)
count=count+1;
}
System.out.println("Number of double letter sequences is "+count+".");
}
}