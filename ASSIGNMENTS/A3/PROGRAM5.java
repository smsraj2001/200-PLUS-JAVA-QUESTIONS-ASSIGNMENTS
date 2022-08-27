/**Design a class to represent a bank account.Include the following members:-
DATA MEMBERS:-
*Name of the depositer
*Account number
*Type of account
*Balance amount in the account

METHODS:-
*To assign initial values
*To deposit an amount
*To withdraw an amount after checking the balance
*To display the name and balance
*Do write proper constructor functions   */

import java.util.*;
public class PROGRAM5//Write Bankaccount.......
{
public static String name;
public static int accno;
public static char type;
public static double bal;
public static double dep;
public static double wit;
public PROGRAM5()
{
name="";
accno=0;
type='C';
bal=500;
dep=0.00;
wit=0.00;
}
public static void initialize_or_accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of the depositor:-");
name=sc.next();
System.out.println("Enter the account number:-");
accno=sc.nextInt();
System.out.println("Enter C for Current account or S for Savings account:-");
type=sc.next().charAt(0);
}
public static void deposit()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the amount to be deposited:-");
dep=sc.nextDouble();
bal +=dep;
System.out.println("The amount after deposition is : "+bal+".");
}
public static void withdraw()
{
System.out.println("Current Balance : "+bal+".");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the amount for withdrawal:-");
wit=sc.nextDouble();
if(wit<=bal)
bal -=wit;
}
public static void display()
{
System.out.println("Name of the depositer: "+name);
System.out.println("Account number of the depositer: "+accno);
System.out.println("Type of the account :"+type);
System.out.println("Amount of deposition: "+dep);
System.out.println("Amount of withdrawal: "+wit);
System.out.println("Amount after all the transactions is "+bal);
}
public static void main(String[]args)
{
System.out.println("FIRST DEPOSITOR:-");
PROGRAM5 obj1=new PROGRAM5();
initialize_or_accept();
deposit();
withdraw();
display();
System.out.println("SECOND DEPOSITOR:-");
PROGRAM5 obj2=new PROGRAM5();
initialize_or_accept();
deposit();
withdraw();
display();
}
}