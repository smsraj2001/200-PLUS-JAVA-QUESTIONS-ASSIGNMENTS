/**Write a program to input a number and check whether it is a prime number or not.*/

import java.util.*;
public class PROGRAM23
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:-");
int n=sc.nextInt();
int c=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
c++;
}
if(c==2)
System.out.println(n+" is a prime number.");
else
System.out.println(n+" is not a prime number.");
}
}