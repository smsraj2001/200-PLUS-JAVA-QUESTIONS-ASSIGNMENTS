/**Write a program that displays an amount in rupees in terms of notes of different denominations e.g.,amount
1782 is diplayed as:-
The rupees 2000 notes are 0 notes.
The rupees 500 notes are 3 notes.
The rupees 100 notes are 2 notes.
The rupees 50 notes are 1 notes.
The rupees 20 notes are 1 notes.
The rupees 10 notes are 1 notes.
The rupees 5 notes/coins are 0 notes.
The rupees 2 coins are 1 notes.
The rupees 1 coins are 0 notes.     */

import java.util.*;
public class EXAMPLE_148
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
long Amt;
long R2000,R500,R100,R50,R20,R10,R5,R2,R1;
System.out.println("Enter the amount:-");
Amt=sc.nextLong();
R2000=0;
R500=0;
R100=0;
R50=0;
R10=0;
R5=0;
R2=0;
R1=0;
long bal=Amt;
R2000=bal/2000;
bal=bal%2000;
R500=bal/500;
bal=bal%500;
R100=bal/100;
bal=bal%100;
R50=bal/50;
bal=bal%50;
R20=bal/20;
bal=bal%20;
R10=bal/10;
bal=bal%10;
R5=bal/5;
bal=bal%5;
R2=bal/2;
bal=bal%2;
R1=bal/1;
System.out.println("The amount is Rs."+Amt+".");
System.out.println("The rupees 2000 notes are "+R2000+" notes.");
System.out.println("The rupees 500 notes are "+R500+" notes.");
System.out.println("The rupees 100 notes are "+R100+" notes.");
System.out.println("The rupees 50 notes are "+R50+" notes.");
System.out.println("The rupees 20 notes are "+R20+" notes.");
System.out.println("The rupees 10 notes are "+R10+" notes.");
System.out.println("The rupees 5 notes/coins are "+R5+" notes/coins.");
System.out.println("The rupees 2 coins are "+R2+" coins.");
System.out.println("The rupees 1 coins are "+R1+" coins.");
}
}