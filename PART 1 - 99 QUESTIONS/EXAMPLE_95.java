/**Write a program to input a string or a sentence and count the number of vowels:-*/

import java.util.*;
public class EXAMPLE_95
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String or a sentence:-");
String S=sc.nextLine();
int l=S.length();
int count=0;
for(int i=0;i<l;i++)
{
char ch=S.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
count++;
}
if(count>0)
System.out.println("The number of vowels are "+count+".");
else
System.out.println("No vowels in the sentence.");
}
}