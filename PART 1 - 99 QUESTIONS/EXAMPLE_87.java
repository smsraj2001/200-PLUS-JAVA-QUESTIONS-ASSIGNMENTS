/**Write a program to acceopt a string.Convert the string to uppercase.Count and output the number of 
double letter sequences that exist in the string.
Sample Input : "SHE WAS FEEDING THE LITTLE RABBIT WITH AN APPLE."
Sample Output : 4         */

import java.util.*;
public class EXAMPLE_87
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence:-");
String S=sc.nextLine();;
int l=S.length();
String S1=S.toUpperCase();
System.out.println(S1);
char ch=' ',c=' ',d=' ';
int count=0;
for(int i=0;i<l-1;i++)
{
c=S1.charAt(i);
d=S1.charAt(i+1);
if(c==d)
count=count+1;
}
System.out.println(count);
}
}