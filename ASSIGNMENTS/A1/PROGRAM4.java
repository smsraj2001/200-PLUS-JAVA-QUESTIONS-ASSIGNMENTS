
/**Write a program to calculate the arithmetic operators in java.*/

import java.util.*;
public class PROGRAM4
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of first number:-");
int a=sc.nextInt();
System.out.println("Enter the value of second number:-");
int b=sc.nextInt();
int result;
result=a+b;
System.out.println("The sum is "+result+".");
result=a-b;
System.out.println("The subtraction is "+result+".");
result=a*b;
System.out.println("The product is "+result+"."); 
result=a/b;
System.out.println("The quotient is "+result+"."); 
result=a%b;
System.out.println("The remainder is "+result+"."); 
   
    }
}
