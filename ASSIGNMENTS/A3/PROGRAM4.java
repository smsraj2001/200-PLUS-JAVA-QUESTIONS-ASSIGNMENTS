/**Write a program to implement a Book class that stores the details of a book such as its 
code,title and price.The class has methods to tell you any of these details individually.*/

import java.util.*;
public class PROGRAM4
{
public static String code;
public static String title;
public static double price;
public PROGRAM4(String bookcode,String t,double pr)
{
code=bookcode;
title=t;
price=pr;
}
Scanner sc=new Scanner(System.in);
public static String getcode()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the code of the book:-");
code=sc.next();
return code;
}
public static String gettitle()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the title of the book:-");
title=sc.next();
return title;
}
public static double getprice()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the price of the book:-");
price=sc.nextDouble();
return price;
}
public static void main(String[]args)
{
String code1="",title1="";
double price1=0.00;
PROGRAM4 obj1=new PROGRAM4(code1,title1,price1);
PROGRAM4 obj2=new PROGRAM4(code1,title1,price1);
PROGRAM4 obj3=new PROGRAM4(code1,title1,price1);
System.out.println("BOOK 1 DETAILS:-");
System.out.println("CODE : "+obj1.getcode()+'\n'+"TITLE : "+obj1.gettitle()+'\n'+"PRICE : "+obj1.getprice()+".");
System.out.println("BOOK 2 DETAILS:-");
System.out.println("CODE : "+obj2.getcode()+'\n'+"TITLE : "+obj2.gettitle()+'\n'+"PRICE : "+obj2.getprice()+".");
System.out.println("BOOK 3 DETAILS:-");
System.out.println("CODE : "+obj3.getcode()+'\n'+"TITLE : "+obj3.gettitle()+'\n'+"PRICE : "+obj3.getprice()+".");
}
}