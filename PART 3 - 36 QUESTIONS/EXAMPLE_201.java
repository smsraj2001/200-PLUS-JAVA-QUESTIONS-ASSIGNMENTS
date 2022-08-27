/**Write a program to find the LCM of two numbers in another method.*/

import java.util.*;
public class EXAMPLE_201
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number:-");
int a=sc.nextInt();
System.out.println("Enter second number:-");
int b=sc.nextInt();
int LCM=1;
for(int i=a;i<=a*b;i++)
{
if(i%a==0&&i%b==0)
{
LCM=i;
break;
}
}
System.out.println("The LCM is "+LCM+".");
}
}