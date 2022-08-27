/**Write a program to calculate the LCM of two numbers.*/

import java.util.*;
public class EXAMPLE_185
{
public static int LCM()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:-");
int a=sc.nextInt();
System.out.println("Enter the second number:-");
int b=sc.nextInt();
int big=(a>b)?a:b;
while(true)
{
if(big%a==0&&big%b==0)
{
System.out.println(big);
return big;
}
System.out.println(big);
++big;
}
}
public static void main(String[]args)
{
int big$=LCM();
System.out.println("The LCM of the  numbers are "+big$+".");
}
}