/**Write a program that offers a menu to choose from various categories of Cinema hall tickets.After
the user selects a category,ask for the number of tickets he/she wants to buy and then tell the total
amount payable.The price list is given below.
.1.Lower Stall           Rs.50
.2.Upper Stall           Rs.70
.3.Balcony               Rs.90
.4.Box                   Rs.120 */

import java.util.*;
public class EXAMPLE_40
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("\t\t\tTHE CINEMA WORLD");
System.out.println("Enter the name of the customer:-");
String name=sc.next();
System.out.println("Enter the address of the customer:-");
String address=sc.next();
System.out.println("Enter LS for Lower Stall.");
System.out.println("Enter US for Upper Stall.");
System.out.println("Enter BA for Balcony.");
System.out.println("Enter BOX for Box.");
System.out.println("Enter your choice:-");
String choice=sc.next();
System.out.println("Enter the number of tickets purchased by the customer:-");
int ticket=sc.nextInt();
int To_pay=0;
switch(choice)
{
case "LS" :
To_pay=ticket*50;
break;
case "US" :
To_pay=ticket*70;
break;
case "BA" :
To_pay=ticket*90;
break;
case "BOX" :
To_pay=ticket*120;
break;
default :
System.out.println("It is a wrong choice.");
}
System.out.println("The amount to be paid by Mr/Mrs "+name+" after buying "+ticket+" tickets is Rs "+To_pay+".");
}
}

    