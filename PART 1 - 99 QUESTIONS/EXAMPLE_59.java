/**WORKHEET 5:-
Write a program in Java to accept the name of an employee and the annual income.Pass the name
and annual income to a function Tax(String name,int income) which displays the name of the 
employee and income tax as per the given tariff:-
ANNUAL INCOME                        INCOME TAX
Up to Rs.50,000                      No tax
Rs.50,001 to Rs.1,00,000             10% of the income exceeding Rs.50,000
Rs.1,00,001 to Rs.1,50,000           Rs.5,000 +20% of the amount eceeding Rs.1,00,000
Rs.1,50,001 and above                Rs.15,000 +30% of the amount eceeding Rs.1,50,000   */ 

import java.util.*;
public class EXAMPLE_59
{
public void Tax(String name,int income)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of the employee:-");
name=sc.next();
System.out.println("Enter the annual income of Mr/Mrs. "+name+" :- ");
income=sc.nextInt();
double tax1;
if(income<=50000)
tax1=0.00;
else if(income>=50001&&income<=100000)
tax1=0.10*income;
else if(income>=100001&&income<=150000)
tax1=5000+(0.20*income);
else
tax1=15000+(0.30*income);
System.out.println("The income tax of Mr/Mrs. "+name+" is "+tax1+".");
}
public static void main(String[]args)
{
EXAMPLE_59 obj=new EXAMPLE_59();
String name1="";
int income1=0;
obj.Tax(name1,income1);
}
} 