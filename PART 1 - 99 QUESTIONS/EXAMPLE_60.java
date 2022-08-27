/**Design a class to represent a bank account.Data members are: name,type of account,accountno,
balance.
Default constructor:-                   Parameterised contructor:-
name :""                                name :Give the name
acc no :0                               accno : 5 digits
type : ""                               type : Savings
balance : -1                            balance : 5000            */

public class EXAMPLE_60
{
public static int accno;
public static String name;
public static char type;
public static double bal;
public EXAMPLE_60()
{
System.out.println("I am in default constructor.");
accno=0;
type='S';
name="";
bal=-1;
}
public EXAMPLE_60(int a,char b,String c,double d)
{
System.out.println("I am in parameterised constructor.");
accno=a;
type=b;
name=c;
bal=d;
}
public static void display()
{
System.out.println("Account Number : "+accno+".");
System.out.println("Account Type : "+type+".");
System.out.println("Name : "+name+".");
System.out.println("Account Balance : "+bal+".");
}
public static void main(String[]args)
{
EXAMPLE_60 obj1=new EXAMPLE_60();
EXAMPLE_60 obj2=new EXAMPLE_60(10001,'C',"S.M.Sutharsan Raj",5000);
//EXAMPLE_60 obj1=new EXAMPLE_60();
obj1.display();
obj2.display();   
}
} 