/**Write a program to calculate the HCF of 2 numbers.*/

import java.util.*;
public class EXAMPLE_184
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:-");
int a=sc.nextInt();
System.out.println("Enter the second number:-");
int b=sc.nextInt();
int remainder,dividend,divisor;
if(a>b)
{
dividend=a;
divisor=b;
}
else
{
dividend=b;
divisor=a;
}
while(divisor!=0)
{
remainder=dividend%divisor;
System.out.println("REMAINDER : "+remainder);
dividend=divisor;
System.out.println("DIVIDEND : "+dividend);
divisor=remainder;
System.out.println("DIVISOR : "+divisor);
}
System.out.println("The HCF is "+dividend+".");
}
}