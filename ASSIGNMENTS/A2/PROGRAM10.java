/**An electronics shop has announced the following seasonal discounts on the purchase of certain items:-
PURCHASE AMOUNT IN Rs.                        DISCOUNT ON LAPTOP                     DISCOUNT ON DESKTOP PC
0-25000                                       0.0%                                   5.0%
25000-57000                                   5.0%                                   7.6%
57001-100000                                  7.5%                                   10.0%
More than 100000                              10.0%                                  15.0%
Write a program based on the above criteria to input name,address,amount of purchase and type of purchase
(L for Laptop and D for Desktop) by a customer.Compute and print the net amount to be paid by a customer along with 
his name and address.
(Hint:discount=(discount rate/100)*amount of purchase
Net amount=(amount of purchase-discount)*/

import java.util.*;
public class PROGRAM10
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of the customer:-");
String name=sc.next();
System.out.println("Enter the address of the customer:-");
String add=sc.next();
System.out.println("Enter the purchase amount:-");
double a=sc.nextDouble();
double d,n;
System.out.println("Enter L for laptop.");
System.out.println("Enter D for desktop PC.");
System.out.println("Enter your choice:-");
char l_d=sc.next().charAt(0);
switch(l_d)
{
case 'L' :
if(a>0&&a<=25000){
d=0*a;n=a-d;}
else if(a>=25001&&a<=57000){
d=0.05*a;n=a-d;}
else if(a>=57001&&a<=100000){
d=0.075*a;n=a-d;}
else{
d=0.10*a;n=a-d;}
System.out.println('\t'+"ELECTRONICS SHOP");
System.out.println("Name of the customer: "+name);
System.out.println("Address of the customer: "+add);
System.out.println("Product purchased: Laptop");
System.out.println("Purchase amount of the item: "+a);
System.out.println("Discount for the amount : "+d);
System.out.println("Final amount after discount: "+n);
break;
case 'D' :
if(a>=0&&a<=25000){
d=0.05*a;n=a-d;}
else if(a>=25001&&a<=57000){
d=0.076*a;n=a-d;}
else if(a>=57001&&a<=100000){
d=0.10*a;n=a-d;}
else{
d=0.15*a;n=a-d;}
System.out.println('\t'+"ELECTRONICS SHOP");
System.out.println("Name of the customer: "+name);
System.out.println("Address of the customer: "+add);
System.out.println("Product purchased: Desktop PC");
System.out.println("Purchase amount of the item: "+a);
System.out.println("Discount for the amount : "+d);
System.out.println("Final amount after discount: "+n);
break;
default:System.out.println("It is Wrong choice.");
}
}
}