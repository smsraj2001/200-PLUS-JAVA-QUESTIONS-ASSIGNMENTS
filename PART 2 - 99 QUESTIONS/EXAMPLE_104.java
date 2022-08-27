/**Write a program to print the largest of 10 numbers.*/

import java.util.*;
public class EXAMPLE_104
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int num=0;
System.out.println("Enter 10 numbers:-");
for(int i=1;i<=10;i++)
{
num=sc.nextInt();
}
int large=0;int small=num;
if(num>large)
{
large=num;
System.out.println(large+" is the largest number.");
}
if(num<small)
{
small=num;
System.out.println(small+" is the smallest number.");
}
}
} 