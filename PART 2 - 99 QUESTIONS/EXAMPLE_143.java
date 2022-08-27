/**Write a program to print the following type:-
INPUT  : SPORTS BOOM IN INDIA
OUTPUT : STROPS MOOB NI AIDNI         */
 
import java.util.*;
public class EXAMPLE_143
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence:-");
String S1=sc.nextLine(),S3="",S2="";
int index=0;
S1=S1+" ";
for(int i=0;i<S1.length();i++)
{
if(S1.charAt(i)==' ')
{
S2=S1.substring(index,i);
for(int j=S2.length()-1;j>=0;j--)
{
char ch=S2.charAt(j);
S3=S3+ch;
}
System.out.print(S3+" ");
S3="";
index=i+1;
}
}
}
}