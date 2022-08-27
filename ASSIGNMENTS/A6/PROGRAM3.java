/**Write a program to convert a string to uppercase if it is in lowercase.*/

import java.util.*;
public class PROGRAM3
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:-");
String S=sc.next();
String S_U=S.toUpperCase();
System.out.println("The String : "+S+" in uppercase is "+S_U+".");
}
}