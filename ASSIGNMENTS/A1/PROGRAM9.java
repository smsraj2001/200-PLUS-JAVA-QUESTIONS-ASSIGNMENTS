 /**Write a program to demonstrate all the methods given in the Math class.*/

import java.util.*;
public class PROGRAM9
{
public static void main(String[]args)
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter the value of x:-");
double x=sc.nextDouble();
System.out.println("Enter the value of y:-");
double y=sc.nextDouble();
System.out.println("Enter the value of a:-");
double a=sc.nextDouble();
System.out.println("Enter the value of b:-");
double b=sc.nextDouble();
int number=0;
double result;
result=Math.sin(x);
System.out.println("The value of sin "+ x+" is " + result+".");
result=Math.cos(x);
System.out.println("The value of cos "+x +" is " + result+".");
result=Math.tan(x);
System.out.println("The value of tan "+ x + " is " + result+".");
result=Math.asin(y);
System.out.println("The value of asin "+y+" is "+result+".");
result=Math.acos(y);
System.out.println("The value of acos "+ y+" is " +result+".");
result=Math.atan(y);
System.out.println("The value of atan "+y+" is " +result+".");
result=Math.atan2(x,y);
System.out.println("The value of atan2 "+x+" and "+y+" is " +result+".");
result=Math.pow(x,a);
System.out.println("The value of power of " +x+" raised to power of "+a+"  is " +result+".");
result=Math.exp(b);
System.out.println("The value of exponent of "+b+" is " +result+".");
result=Math.log(x);
System.out.println("The value of logarithm of "+ x+" is " +result+".");
result=Math.sqrt(b);
System.out.println("The value of square root of "+b+" is " +result+".");
result=Math.ceil(y);
System.out.println("The value of ceil of "+y + " is " +result+".");
result=Math.floor(a);
System.out.println("The value of floor of "+ a+" is " +result+".");
result=Math.rint(x);
System.out.println("The value of rint of "+x+" is " +result+".");
result=Math.abs(y);
System.out.println("The absoute value of "+y+" is " +result+".");
result=Math.max(x,y);
System.out.println("The maximum of "+x+" and "+y+" is " +result+".");
result=Math.min(a,b);
System.out.println("The minimum of "+a+" and "+b+" is " +result+".");
result=Math.round(b);
System.out.println("The value of round up/down of "+b+" is "+result+".");
result=Math.random();
System.out.println("The value of random number between 0 and 1 is "+result+".");
result=Math.random()*10;
number=(int)result;
System.out.println("The value of random number between 0 and 10 is "+number+".");
}
}