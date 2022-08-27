/**Write a program to calculate the age of  person according to the years.*/

import java.util.*;
public class EXAMPLE_154
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the present age of the person:-");
int age=sc.nextInt();
System.out.println("Enter the value of present year(yyyy):-");
int year1=sc.nextInt();
System.out.println("Enter for which year you want to check the age:-");
int year2=sc.nextInt();
int year;
if(year2>year1)
{
year=year2-year1;
age=age+year;
}
else if(year1>year2)
{
year=year1-year2;
if(year<=0)
{
System.out.println("Enter a valid second year reading.");
}
else
age=age-year;
}
else
System.out.println("Same age.");
System.out.println("The age in the year "+year2+" would be "+age+".");
}
}