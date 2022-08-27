/**Write a program to check entered character is a digit or an alphabet or a special character*/

import java.util.*;
public class PROGRAM5
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a character to check it is a digit or alphabet or special character:-");
char ch=sc.next().charAt(0);
if(ch>='0'&&ch<='9')
System.out.println(ch+" is a digit.");
else if(ch>=65&&ch<=90)
System.out.println(ch+" is an alphabet.");
else if(ch>=97&&ch<=122)
System.out.println(ch+" is an alphabet.");
else
System.out.println(ch+" is a special character.");
}
}
    