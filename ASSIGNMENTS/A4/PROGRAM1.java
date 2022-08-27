/**Write a program to display all the odd numbers from N to 1:-*/

import java.util.*;
public class PROGRAM1
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to begin the range of odd numbers:-");
int N=sc.nextInt();
for(int i=N;i>=1;i--)
{
if(i%2!=0)
System.out.println("The odd number is "+i);
}
}
}



















