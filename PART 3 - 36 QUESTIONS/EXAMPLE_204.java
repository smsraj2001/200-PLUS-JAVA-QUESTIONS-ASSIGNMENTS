/**Write a program to add the decimal part of two numbers.*/

import java.util.*;
public class EXAMPLE_204
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number:-");
double d1=sc.nextDouble();
System.out.println("Enter second number:-");
double d2=sc.nextDouble();
String S1=Double.toString(d1);
int i1=S1.indexOf('.');
i1=i1+1;
String S$1=S1.substring(i1);
double x1=Double.parseDouble(S$1);
System.out.println("X1 "+x1);
String S2=Double.toString(d2);
int i2=S2.indexOf('.');
i2=i2+1;
String S$2=S2.substring(i2);
double x2=Double.parseDouble(S$2);
System.out.println("X2 "+x2);
double sum=x1+x2;
System.out.println("The sum of decimal part is "+sum+".");
}
}