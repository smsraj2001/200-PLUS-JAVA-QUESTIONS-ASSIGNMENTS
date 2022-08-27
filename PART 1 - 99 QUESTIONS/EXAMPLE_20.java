/**Write a menu driver program to find the sum,difference and product of two numbers.Perform tasks accordingly:-
Enter '+' to find the sum of two numbers.
Enter '-' to find the difference of two numbers.
enter '*' to find the product of two numbers.*/

import java.util.*;
public class EXAMPLE_20
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter '+' for addition of two numbers.");
System.out.println("Enter '-' for difference of two numbers."); 
System.out.println("Enter '*' for product of two numbers.");
System.out.println("Enter '/' for division of two numbers.");
System.out.println("Enter '%' for modulous of two numbers.");
System.out.println("Enter your choice:-");
char choice=sc.next().charAt(0);
System.out.println("Enter two numbers:-");
System.out.println("Enter the first number:-");
int no1=sc.nextInt();
System.out.println("Enter the second number:-");
int no2=sc.nextInt();
int result;
switch(choice)
{
case '+':
result=no1+no2;
System.out.println("The sum of the given numbers is "+result+".");
break;
case '-':
result=no1-no2;
System.out.println("The difference of the given numbers is "+result+".");
break;
case '*':
result=no1*no2;
System.out.println("The product of the given numbers is "+result+".");
break;
case '/':
result=no1/no2;
System.out.println("The division of the given numbers is "+result+".");
break;
case '%':
result=no1%no2;
System.out.println("The modulous of the given numbers is "+result+".");
break;
default:
System.out.println("It is wrong a choice.");
break;
}
}
}