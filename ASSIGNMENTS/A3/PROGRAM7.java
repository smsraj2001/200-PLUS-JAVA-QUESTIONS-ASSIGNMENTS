/**Write a program that uses a method power() to raise a number m to power n.The method takes int values for m
and n and returns the result correctly.Use a default value of 2 for n to make the function calculate squares
when this argument is omitted.Write a main() method to get the value of m and n to display the calculated
result.*/

import java.util.*; 
public class PROGRAM7
{
public static double power(int m,int n)
{
double result=Math.pow(m,n);
if(n==0)
{
n=2;
result=Math.pow(m,n);
return result;
}
else
return result;
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("CASE 1 :-");
System.out.println("Enter the value of m :-");
int m1=sc.nextInt();
System.out.println("Enter the value of n:-");
int n1=sc.nextInt();
PROGRAM7 obj1=new PROGRAM7();
double result1=obj1.power(m1,n1);
System.out.println("The result of "+m1+"  raised to "+n1+" is "+result1+".");
PROGRAM7 obj2=new PROGRAM7();
System.out.println("CASE 2 :-");
System.out.println("Enter the value of m :-");
int m$=sc.nextInt();
n1=0;
double result2=obj2.power(m$,n1);
System.out.println("The result of "+m$+" raised to n is "+result2+".");
}
}