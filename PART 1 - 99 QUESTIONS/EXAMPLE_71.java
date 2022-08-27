/**Write a program to acceopt a string.Convert the string to uppercase.Count and output the number of 
double letter sequences that exist in the string.
Sample Input : "SHE WAS FEEDING THE LITTLE RABBIT WITH AN APPLE."
Sample Output : 4         */

//import java.io.*;
import java.util.*;
public class EXAMPLE_71
{
public static void main(String[]args)//throws IOException
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:-");
String S=sc.nextLine();
S=S.toUpperCase();
int l=S.length();
System.out.println("Length of the given String is "+l+".");
System.out.println(S);
char c,d,e;
int count=0;
for(int i=0;i<=l-2;i++)
{
c=S.charAt(i);
d=S.charAt(i+1);
if(c==d)
{
count=count+1;
}
}
System.out.println("Number of double sequences is "+count+".");
}
}

