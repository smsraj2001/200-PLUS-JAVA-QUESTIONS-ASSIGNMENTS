/**Constructor and function programs.*/

import java.util.*;
public class EXAMPLE_214
{
String name;
int days,price;
double fine;
public EXAMPLE_214()
{
name="";
price=0;
days=0;
}
public EXAMPLE_214(String nm,int dd,int pr)
{
name=nm;
days=dd;
price=pr;
}
public void calculate()
{
if(days<=7)
fine=days*25;
else if(days>=8&&days<=15)
fine=7*25+(days-7)*40;
else if(days>=16&&days<=30)
fine=7*25+8*40+(days-15)*60;
else
fine=7*25+8*40+15*60+(days-30)*80;
}
public void display()
{
System.out.println("NAME OF CUSTOMER : "+name);
System.out.println("DAYS : "+days);
System.out.println("BOOK PRICE AMOUNT : "+price);
System.out.println("FINE : "+fine+'\n'+"IN RUPEES IS "+(fine/100));
}
public static void main(String[]args)
{
EXAMPLE_214 obj1=new EXAMPLE_214();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of the customer:-");
String nm1=sc.next();
System.out.println("Enter the price of the book:-");
int pr1=sc.nextInt();
System.out.println("Enter the number of days:-");
int dd1=sc.nextInt();
EXAMPLE_214 obj2=new EXAMPLE_214(nm1,dd1,pr1);
obj2.calculate();
obj2.display();
}
}