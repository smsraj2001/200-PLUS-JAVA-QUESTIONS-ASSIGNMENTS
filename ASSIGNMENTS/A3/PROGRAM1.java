/**Digital World announces seasonal discount on the laptops in the given order.
COST OF THE LAPTOP                            DISCOUNT
Rs.20,000 - Rs.30,000                         10%
Rs.30,000 - Rs.40,000                         15%
Rs.40,000 - Rs.50,000                         18%
>=Rs.50,000                                   20%

An additional discount of 5% on all types of laptops is given.Sales tax is calculated at 12% on the 
price after the discounts.Define a class to accept the cost of the laptop and print the amount 
payable by the customer on purchase.(Use constructor).*/
 
import java.util.*;
public class PROGRAM1
{
public PROGRAM1()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of the customer:-");
String name=sc.next();
System.out.println("Enter the address of the customer:-");
String address=sc.next();
System.out.println("Enter the cost price of the laptop:-");
double A=sc.nextDouble();
double D,A2,D2,A3,ST,FA;
if(A>=0&&A<20000)
{
D=0.00*A;
A2=A-D;
D2=0.05*A2;
A3=A2-D2;
ST=0.12*A3;
FA=A3+ST;
}
else if(A>=20000&&A<=30000)
{
D=0.10*A;
A2=A-D;
D2=0.05*A2;
A3=A2-D2;
ST=0.12*A3;
FA=A3+ST;
}
else if(A>=30001&&A<=40000)
{
D=0.15*A;
A2=A-D;
D2=0.05*A2;
A3=A2-D2;
ST=0.12*A3;
FA=A3+ST;
}
else if(A>=40001&&A<=50000)
{
D=0.18*A;
A2=A-D;
D2=0.05*A2;
A3=A2-D2;
ST=0.12*A3;
FA=A3+ST;
}
else
{
D=0.20*A;
A2=A-D;
D2=0.05*A2;
A3=A2-D2;
ST=0.12*A3;
FA=A3+ST;
}
System.out.println("The name of the customer: "+name);
System.out.println("The address of the customer: "+address);
System.out.println("The amount after the discount is Rs. "+A3+".");
System.out.println("The sales tax is Rs "+ST+".");
System.out.println("The final amount to be paid by Mr/Mrs. "+name+" after discount and sales tax is Rs "+FA+".");
}
public static void main(String[]args)
{
PROGRAM1 obj=new PROGRAM1();
}
}  