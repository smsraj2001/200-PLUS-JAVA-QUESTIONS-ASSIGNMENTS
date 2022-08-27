/**Using a switch menu driven program, convert temperature entered by user from Fahrenheit to Celsius or Celsius to 
Fahrenheit.[C=5/9*(F-32) and F=1.8*(c+32)]*/

import java.util.*;
public class PROGRAM8
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter '1' to convert temperature from Fahrenheit to Celsius.");
System.out.println("Enter '2' to convert temperature from Celsius to Fahrenheit.");
System.out.println("Enter your choice:-");
int choice=sc.nextInt();
double C,F;
switch(choice)
{
case 1 :
System.out.println("Enter the temperature in fahrenheit:-");
F=sc.nextDouble();
C=(double)(5*(F-32))/9;
System.out.println("The temperature "+F+" in fahrenheit is "+C+" in Celsius.");
break;
case 2 :
System.out.println("Enter the temperature in Celsius:-");
C=sc.nextDouble();
F=1.8*(C+32);
System.out.println("The temperature "+C+" in Celsius is "+F+" in fahrenheit.");
break;
default:
System.out.println("It is a wrong choice.");
}
}
}    