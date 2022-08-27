/**Write a program to assign a full path and file name.*/

import java.util.*;
public class EXAMPLE_180
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a full path file name:-");
String S=sc.next();
int l=S.length();
int a=S.lastIndexOf('\\');
String path=S.substring(0,a+1);
int b=S.indexOf('.');
String file_name=S.substring(a+1,b);
String extension=S.substring(b+1,l);
System.out.println("PATH : "+path);
System.out.println("FILE NAME : "+file_name);
System.out.println("EXTENSION : "+extension);
}
}