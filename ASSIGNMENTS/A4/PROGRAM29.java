/**Write a program to input a number and find the sum of all digits present in it.*/

import java.util.*;
public class PROGRAM29
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:-");
int num=sc.nextInt();
int n=num;
int sum=0,r=0;
while(n!=0)
{
r=n%10;
sum=sum+r;
n=n/10;
}
System.out.println("The sum of the digits of the number "+num+"  are "+sum+".");
}
}