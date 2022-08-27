/**Write a program to check whether an entered year is leap year or not.*/

import java.util.*;
public class EXAMPLE_42
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a year(yyyy):-");
int year=sc.nextInt();
if(year%100==0)
{
if(year%400==0)
System.out.println(year+" is a leap year.");
else
System.out.println(year+" is not a leap year.");
}
else
{
if(year%4==0)
System.out.println(year+" is a leap year.");
else
System.out.println(year+" is not a leap year.");
}
}
}