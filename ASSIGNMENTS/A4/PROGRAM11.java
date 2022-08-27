/**Write a program to display all the factors of a number.*/

import java.util.*;
public class PROGRAM11
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to find its factors:-");
int N=sc.nextInt();
for(int i=1;i<=N;i++)
{
if(N%i==0)
System.out.println("The factor is "+i+".");
}
}
}   