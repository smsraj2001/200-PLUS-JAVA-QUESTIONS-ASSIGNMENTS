/**write a program that reads the month number and tells the number of days in that month.*/

import java.util.*;
public class EXAMPLE_38
{
public static void main(String[]args)
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter the year:-");
int year=sc.nextInt();
System.out.println("Enter the number of the month from 1 to 12:-");
int month=sc.nextInt();
int num=0;
switch(month)
{
case 2 :
if(((year%4==0)&& !(year%100==0)||year%400==0))
num=29;
else
num=28;
System.out.println("The number of days in this month is "+num+".");
break;
case 1 :
case 3 :
case 5 :
case 7 :
case 8 :
case 10 :
case 12:
num=31;
System.out.println("The number of days in this month is "+num+".");
break;
case 4 :
case 6 :
case 9 :
case 11 :
num=30;
System.out.println("The number of days in this month is "+num+".");
break;
default:
System.out.println("it is an invalid month.");
break;
}
}
}


 
