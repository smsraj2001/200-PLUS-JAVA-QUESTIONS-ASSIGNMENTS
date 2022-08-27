/**Write a program to accept an alphabet and check whether a vowel or consonant.*/

import java.util.*;
public class PROGRAM4
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter an alphabet:-");
char alpha=sc.next().charAt(0);
if(alpha=='A'||alpha=='E'||alpha=='I'||alpha=='O'||alpha=='U')
System.out.println(alpha+" is a vowel.");
else if(alpha=='a'||alpha=='e'||alpha=='i'||alpha=='o'||alpha=='u')
System.out.println(alpha+" is a vowel.");
else
System.out.println(alpha+" is a consonant.");
}
}   