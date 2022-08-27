/**Write a program to menu driven program to print Simple interest or Compound interest according to
the user's choice.*/

import java.util.*;
public class EXAMPLE_37
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 'SI' to calculate Simple Interest.");
System.out.println("Enter 'CI' to calculate Compound Interest.");
System.out.println("Enter your choice:-");
String Interest=sc.next();
double SI,CI,amount,P,R,n;
System.out.println("Enter the value of the principal amount:-");
P=sc.nextInt();
System.out.println("Enter the value of rate of interest:-");
R=sc.nextInt();
System.out.println("Enter the value of time:-");
n=sc.nextInt();
switch(Interest)
{
case "SI" :
SI=(P*n*R)/100;
System.out.println("The value of Simple Interest is "+SI+".");
break;
case "CI" :
amount=P*Math.pow(((100+R)/100),n);
System.out.println("The amount at the end of "+n+" years is "+amount);
CI=amount-P;
System.out.println("Therefore the total compound interest generated after "+n+" years is "+CI);
break;
default:
System.out.println("It is a wrong choice.");
}
}
}