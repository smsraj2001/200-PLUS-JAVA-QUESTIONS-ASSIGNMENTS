/**Write a program to accept an alphabet from the keyboard and check whether it is a vowel or consonant.*/

import java.util.*;
public class EXAMPLE_22
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter an alphabet:-");
char ch=sc.next().charAt(0);
if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
System.out.println(ch+" is a vowel.");
else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
System.out.println(ch+" is a vowel.");
else
System.out.println(ch+" is a consonant.");
}
}   