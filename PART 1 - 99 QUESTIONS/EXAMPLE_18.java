/**Write a program that inputs principal amount,rate of interest and time and calculates total amount at the end of
last year and also the compound interest.*/

import java.util.*; 
public class EXAMPLE_18
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of the principal amount:-");
double P=sc.nextInt();
System.out.println("Enter the value of rate of interest:-");
double R=sc.nextInt();
System.out.println("Enter the value of time:-");
double n=sc.nextInt();
double amount,CI;
amount=(double)P*Math.pow(((100+R)/100),n);
System.out.println("The amount at the end of "+n+" years is "+amount);
CI=(double)amount-P;
System.out.println("Therefore the total compound interest generated after "+n+" years is "+CI);
}
}

