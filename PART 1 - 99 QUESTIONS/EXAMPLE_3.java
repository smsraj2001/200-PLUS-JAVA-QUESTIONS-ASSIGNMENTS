/**Write a program to find a number is divisible by 5 or not.*/

import java.util.*;
public class EXAMPLE_3
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of the calculating number:-");
int n1=sc.nextInt();
if(n1%5==0)
System.out.println(n1+" is divisible by 5.");
else
System.out.println(n1+" is not divisible by 5.");
}
}