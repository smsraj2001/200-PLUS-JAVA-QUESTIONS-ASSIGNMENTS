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

public class EXAMPLE_61
{
private String Depositorname;
private long Accountnumber;
private String Accounttype;
private double Balanceamount;
public EXAMPLE_61()
{
Depositorname="";
Accountnumber=0;
Accounttype="";
Balanceamount=-1;
}
public EXAMPLE_61(String dname,long accno,String acctype,double balamount)
{
Depositorname=dname;
Accountnumber=accno;
Accounttype=acctype;
Balanceamount=balamount;
}
public void initialize(String dname,long accno,String acctype,double balamount)
{
Depositorname=dname;
Accountnumber=accno;
Accounttype=acctype;
Balanceamount=balamount;
}
public void display()
{
System.out.println("Name of the depositor :"+Depositorname);
System.out.println("Account number:"+Accountnumber);
System.out.println("Account Type :"+Accounttype);
System.out.println("Balance amount :"+Balanceamount);
}
public void deposit(double  amount)
{
Balanceamount +=amount;
}
public void withdraw(double amount)
{
if(amount<=Balanceamount)
Balanceamount -=amount;
}
public static void main(String[]args)
{
EXAMPLE_61 acc1=new EXAMPLE_61();
acc1.initialize("Chethan",31920,"Saving",8000);
EXAMPLE_61 acc2=new EXAMPLE_61("Ronald",41777,"Current",70000);
acc1.deposit(17000);
acc1.display();
acc2.withdraw(80000);
acc2.display();
}
}