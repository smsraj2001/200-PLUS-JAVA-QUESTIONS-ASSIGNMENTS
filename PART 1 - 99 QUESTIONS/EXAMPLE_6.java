/**Accept a number from the keyboard and check whether it is a positive number,negative number or zero.Print
suitable messages.*/

import java.util.*;
public class EXAMPLE_6
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number for checking the result:-");
int n1=sc.nextInt();
if(n1>0)
System.out.println(n1+" is a positive number.");
else if(n1<0)
System.out.println(n1+" is a negative number.");   
else
System.out.println("The number is zero.");
}
}