/**Write a program to show the use of toString() method and valueOf() method.*/

import java.util.*;
public class PROGRAM15
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:-");
String S1=sc.next();
System.out.println("The string "+S1+" after using toString() is "+S1.toString());
System.out.println("Enter another string:-");
String S2=sc.next();
System.out.println("Enter a string or number or anything,etc.... to do valueOf():-");
String VO=sc.next();
System.out.println("The string "+S2+" after using valueOf() is "+S2.valueOf(VO));
}
}