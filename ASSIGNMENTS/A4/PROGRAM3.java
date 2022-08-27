/**Write a program to display the square of numbers from 1 to N.*/

import java.util.*;
public class PROGRAM3
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to begin the range of square of numbers:-");
int N=sc.nextInt();
for(int i=1;i<=N;i++)
{
int sq=1;
sq=(int)Math.pow(i,2);
System.out.println("The square of "+i+" is "+sq+".");	
}
}
}