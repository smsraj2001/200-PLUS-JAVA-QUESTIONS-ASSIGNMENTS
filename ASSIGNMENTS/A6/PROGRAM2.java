/**Write a program to check if 2 strings are equal.*/

import java.util.*;
public class PROGRAM2
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first string:-");
String S1=sc.next();
System.out.println("Enter second string:-");
String S2=sc.next();
boolean ch=S1.equals(S2);
if(ch==true)
System.out.println("String : "+S1+" is equal to String : "+S2+".");
else
System.out.println("String : "+S1+" is not equal to String :"+S2+".");
}
}