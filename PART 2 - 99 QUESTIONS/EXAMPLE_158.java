/**Write a program to input a number and print the coresponding ASCII character.*/

import java.util.*;
public class EXAMPLE_158
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n=0;
try
{
System.out.println("Enter the number to print the character:-");
n=sc.nextInt();
}
catch(Exception e)
{
System.out.println("Enter a valid integer number.");
return;
}
char ch=(char)n;
System.out.println("The character is "+ch+".");
}
}
    