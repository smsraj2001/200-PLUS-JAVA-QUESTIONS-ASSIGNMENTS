/**Write a program to input a number and display the largest and smallest digit in it.*/

import java.util.*;
public class PROGRAM30
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:-");
int num=sc.nextInt();
int n=num,L=0,r=0,S=10;
while(n>0)
{
r=n%10;
if(r>L)
L=r;
if(r<S)
S=r;
n=n/10;
}
System.out.println("In the number "+num+" the largest digit is "+L+" and the shortest digit is "+S+".");
}
}