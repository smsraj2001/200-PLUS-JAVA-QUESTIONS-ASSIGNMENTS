/**Write a program to calculate profit after reading cost price and selling price through keyboard.*/

import java.util.*;
public class PROGRAM15
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of Cost Price:-");
double CP=sc.nextDouble();
System.out.println("Enter the value of Selling Price:-");
double SP=sc.nextDouble();
double profit;
profit=SP-CP;
System.out.println("The Profit is Rs:"+profit+".");
}
}