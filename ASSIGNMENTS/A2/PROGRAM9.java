/**Write a program that outputs the result of the following calculations based on the user's choice.:-
1) Natural logarithm of the number.
2)Absolute value of the number.
3)Square root of the number.
4)Random number between 0-10.*/

import java.util.*;
public class PROGRAM9
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter '1' to calculate the Natural logarithm of the number.");
System.out.println("Enter '2' to calculate the Absolute value of the number.");
System.out.println("Enter '3' to calculate the Square root of the number.");
System.out.println("Enter '4' to calculate the Random number between 0-10.");
System.out.println("Enter your choice for calculation:-");
int choice=sc.nextInt();
int num;
double result;
switch(choice)
{
case 1 :
System.out.println("Enter a number to calculate the Logarithm of a number:-");
num=sc.nextInt();
result=Math.log(num);
System.out.println("The value of Logarithm of "+num+" is "+result+".");
break;
case 2 :
System.out.println("Enter a number to calculate the Absolute value of the number:-");
num=sc.nextInt();
result=Math.abs(num);
System.out.println("The value of absolute value of "+num+" is "+result+".");
break;
case 3 :
System.out.println("Enter a number to calculate the square root of the number:-");
num=sc.nextInt();
result=Math.sqrt(num);
System.out.println("The value of square root of "+num+" is "+result+".");
break;
case 4 :
result=(Math.random())*10;
System.out.println("The random value between 0-10 is "+result);
break;
default:
System.out.println("It is a wrong choice.");
break;
}
}
}   