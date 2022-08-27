/**Write a program to find whether a person can vote or not.Enter the person's name.*/

import java.util.*;
public class EXAMPLE_2
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of the person:-");
String name=sc.next();
System.out.println("Enter the age of "+name+":-");
int age=sc.nextInt();
if(age>=18)
System.out.println(name+" can vote."); 
else
System.out.println(name+" cannot vote.");
}
}    