/**Write a program to input a string and print the freuency of characters entered by the user.*/

import java.util.*;
public class EXAMPLE_141
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:-");
String S=sc.next();
System.out.println("Enter the character to check its frequency:-");
char ch1=sc.next().charAt(0);
int count=0;
for(int i=0;i<S.length();i++)
{
char ch2=S.charAt(i);
if(ch1==ch2)
count=count+1;
}
if(count!=0)
System.out.println("The frequency of "+ch1+" is "+count+".");
else
System.out.println(ch1+" is not found in the string.");
}
}

    