/**Write a program to find whether a number is an odd or an even number.*/

import java.util.*;
public class EXAMPLE_5
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number for the calculation:-");
int n1=sc.nextInt();
if(n1%2==0)
System.out.println(n1+" is an even number.");
else
System.out.println(n1+" is an odd number.");
}
}