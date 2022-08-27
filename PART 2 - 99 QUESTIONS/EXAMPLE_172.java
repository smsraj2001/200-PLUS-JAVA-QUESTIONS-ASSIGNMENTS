/**Write a program to check whether a code is valid security code or not:-*/

import java.util.*;
public class EXAMPLE_172
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Security code:-");
while(true)
{
String S=sc.next();
if(S.length()!=11)
{
System.out.println("Invalid code."+"\n"+"Please enter the code again:-");
continue;
}
char ch1=S.charAt(0);
char ch2=S.charAt(1),ch3=S.charAt(2),ch4=S.charAt(3),ch5=S.charAt(4),ch6=S.charAt(5),ch7=S.charAt(6),ch8=S.charAt(7),ch9=S.charAt(8),ch10=S.charAt(9),ch11=S.charAt(10);
boolean b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
b1=Character.isDigit(ch1);
b2=Character.isDigit(ch2);
b3=Character.isDigit(ch3);
b4=(ch4=='-');
b5=Character.isDigit(ch5);
b6=Character.isDigit(ch6);
b7=(ch7=='-');
b8=Character.isDigit(ch8);
b9=Character.isDigit(ch9);
b10=Character.isDigit(ch10);
b11=Character.isDigit(ch11);
if(b1==true&&b2==true&&b3==true&&b4==true&&b5==true&&b6==true&&b7==true&&b8==true&&b9==true&&b10==true&&b11==true)
{
System.out.println("It is a valid Security code.");
break;
}
else
{
System.out.println("Invalid code."+"\n"+"Please enter the code again:-");
}
}
}
}