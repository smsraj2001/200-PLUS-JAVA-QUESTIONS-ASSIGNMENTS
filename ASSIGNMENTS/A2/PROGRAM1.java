/**Write a program to check whether an entered number is an odd or even number.*/

import java.util.*;
public class PROGRAM1 
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to check whether it is an odd or even number:-");
int num=sc.nextInt();
if(num%2==0)
System.out.println(num+" is an even number.");
else
System.out.println(num+" is an odd number.");
}
}
    