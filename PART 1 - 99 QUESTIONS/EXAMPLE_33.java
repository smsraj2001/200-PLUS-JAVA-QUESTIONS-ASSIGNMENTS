/**Write a menu driven program to accept a number from the user and tell the corresponding day to that number.
Example:6 is Saturday.Also mention the weekday and weekend*/

import java.util.*;
public class EXAMPLE_33
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number from 1-7 to get the Day:-");
int day=sc.nextInt();
switch(day)
{
case 1 :
System.out.println("The day is Sunday.It is a weekday.");
break;
case 2 :
System.out.println("The day is Monday.");
break;
case 3 :
System.out.println("The day is Tuesday.");
break;
case 4 :
System.out.println("The day is Wednesday.");
break;
case 5 :
System.out.println("The day is Thursday.");
break;
case 6 :
System.out.println("The day is Friday.");
break;
case 7 :
System.out.println("The day is Saturday.It is a weekend.");
break;
default:
System.out.println("A wrong number is entered.");
}
}
}
