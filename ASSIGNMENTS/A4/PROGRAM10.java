/**Write a program to find and display the sum of A^1 + A^2 + A^3 + etc...till A^n where A is 
entered by the user.*/

import java.util.*;
public class PROGRAM10
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to find the sum of the series:-");
int A=sc.nextInt();
long n=1,pow=0,sum=0;
for(int i=1;i<=A;i++)
{
pow=(long)Math.pow(A,n);
System.out.print(pow+" + ");
sum=sum+pow;
n=n+1;
}
System.out.println();
System.out.println("The sum of the series is "+sum+".");
}
}