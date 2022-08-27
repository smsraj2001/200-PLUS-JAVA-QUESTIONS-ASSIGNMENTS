/**Write a program to accept a character and check whether it is in Upper case or lower case using ASCII values.*/

import java.util.*; 
public class EXAMPLE_8
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a character:-");
char ch=sc.next().charAt(0);
if(ch>=65&&ch<=90)
System.out.println(ch+" is in Upper case.");
else if(ch>=97&&ch<=122)
System.out.println(ch+" is in lower case.");
else if(ch>=48&&ch<=57)
System.out.println(ch+" is a digit.");
else
System.out.println(ch+" is a special character i.e., they are some sort of numbers or symbols");
}
}
