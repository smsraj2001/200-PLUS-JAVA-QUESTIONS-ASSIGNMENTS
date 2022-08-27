/**Write a program to accept a character and check whether it is in Uppercase or lowercase or other
characters without using ASCII values.*/

import java.util.*; 
public class EXAMPLE_9
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);   
System.out.println("Enter a character :-");
char ch=sc.next().charAt(0);
if(ch>='A'&&ch<='Z')
System.out.println(ch+" is in Uppercase.");
else if(ch>='a'&&ch<='z')
System.out.println(ch+" is in lowercase.");
else
System.out.println("The given character is a number or a symbol.");
}
}