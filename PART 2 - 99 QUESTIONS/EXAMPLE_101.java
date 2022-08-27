/**Write a progarm to find the number of occurances of a word in a sentence.*/

import java.util.*;
public class EXAMPLE_101
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a source sentence:-");
String S=sc.nextLine();
System.out.println("Enter a word to be searched:-");
String W=sc.next(),S1="";
S=S+" ";
int l=S.length(),index=0,count=0;;
for(int i=0;i<l;i++)
{
if(S.charAt(i)==' ')
{
S1=S.substring(index,i);
if(S1.equalsIgnoreCase(W))
count=count+1;
index=i+1;
}
}
if(count>0)
System.out.println("The word : \'"+W+"\' occurs "+count+" times in the sentence.");
else
System.out.println(W+" does not exist in the sentence.");
}
}