/**Shasha Travels Pvt. Ltd. gives the following discount to its customers:-
TICKET AMOUNT                                          DISCOUNT
Above Rs:70000                                         18%
Rs:55001 to Rs:70000                                   16%
Rs:35001 to Rs:55000                                   12%
Rs:25001 to Rs:35000                                   10%
less than Rs:25000                                     2%
Write a program to input the name and ticket amount for the customer and calculate the discoubt amount and net amount
to be paid.*/

import java.util.*;
public class PROGRAM6 
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println('\t'+"Shasha Travels Pvt. Ltd.");
System.out.println("Enter the name of the customer:-");
String name=sc.next();
System.out.println("Enter the ticket amount of "+name+":-");
int TA=sc.nextInt();
double Dis_A,NA;
if(TA>70000)
{
Dis_A=(0.18)*TA;
NA=TA-Dis_A;
}
else if(TA>=55001&&TA<=70000)
{
Dis_A=(0.16)*TA;
NA=TA-Dis_A;
}
else if(TA>=35001&&TA<=55000)
{
Dis_A=(0.12)*TA;
NA=TA-Dis_A;
}
else if(TA>=25001&&TA<=35000)
{
Dis_A=(0.10)*TA;
NA=TA-Dis_A;
}
else
{
Dis_A=(0.02)*TA;
NA=TA-Dis_A;
}
System.out.println("The discount amount is Rs "+Dis_A+".");
System.out.println("The net amount to be paid by Mr/Mrs: "+name+" is Rs "+NA+".");
}
}   