/**Write a program to read the month number and print corresponding month.*/

import java.util.*;
public class EXAMPLE_25
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of month to display the corresponding month:-");
System.out.println("Enter your choice:-");
int month=sc.nextInt();
switch(month)
{
case 1:
System.out.println("The month corresponding to the number is January.");
break;
case 2:
System.out.println("The month corresponding to the number is February.");
break;
case 3:
System.out.println("The month corresponding to the number is March.");
break;
case 4:
System.out.println("The month corresponding to the number is April.");
break;
case 5:
System.out.println("The month corresponding to the number is May.");
break;
case 6:
System.out.println("The month corresponding to the number is June.");
break;
case 7:
System.out.println("The month corresponding to the number is July.");
break;
case 8:
System.out.println("The month corresponding to the number is August.");
break;
case 9:
System.out.println("The month corresponding to the number is September.");
break;
case 10:
System.out.println("The month corresponding to the number is October.");
break;
case 11:
System.out.println("The month corresponding to the number is November.");
break;
case 12:
System.out.println("The month corresponding to the number is December.");
break;
default:
System.out.println("The month is an invalid month due to  the wrong number entered.");
break;
}
}
}