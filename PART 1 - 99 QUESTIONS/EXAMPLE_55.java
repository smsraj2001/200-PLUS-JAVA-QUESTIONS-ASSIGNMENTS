/**WORKSHEET 1:- 
Write a program to calculate monthly electricity bill of a consumer according to the units 
consumed.The tariff is given below:-
UNITS CONSUMED                                        CHARGE
Up to 100 units                                       Rs 1.25 per unit
For next 100 units                                    Rs 1.50 per unit
More than 200 units                                   Rs 1.80 per unit
Unit consumed=Present reading-Previous reading
Use a function name cal(int u) and print the information in the main function as per the
given format:-
CONSUMER NO.        NAME                 UNITS CONSUMED                  AMOUNT
_ _ _ _ _ _ _      _ _ _ _               _ _ _ _ _ _ _ _                _ _ _ _ _   */

import java.util.*;
public class EXAMPLE_55 
{
double PR,PA;
public void cal(int u)
{
double A;
if(u<=100)
A=u*1.25;
else if(u>100&&u<=200)
A=(100*1.25)+(u-100)*1.50;
else
A=100*1.25+100*1.50+(u-200)*1.80;
System.out.println("AMOUNT : "+A);
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
EXAMPLE_55 obj=new EXAMPLE_55();
String name=" ";
String name1=name+" ";
System.out.println("                   WORKSHEET 1");
System.out.println("                ELECTRICITY BILL");
System.out.println("CONSUMER NUMBER : ");
int cn=sc.nextInt();
System.out.println("NAME : ");
name1=sc.nextLine();
System.out.println("Enter the previous reading of unit:- ");
int PA1=sc.nextInt();
System.out.println("Enter the present reading of unit:- ");
int PR1=sc.nextInt();
int u1=PR1-PA1;
System.out.println("UNITS : "+u1);
obj.cal(u1);
}
}