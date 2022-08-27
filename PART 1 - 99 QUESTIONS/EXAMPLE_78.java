/**Write a program to check number is perfect number or not.*/

import java.util.*;
public class EXAMPLE_78
{
public static void main(String args[]) 
{
System.out.println("Enter number to check perfect number or not : ");
Scanner sc= new Scanner(System.in);
int number = sc.nextInt();
int sumOfDivisors = 0;
for(int i = 1; i< number; i++) 
{
if(number % i == 0) 
{
sumOfDivisors = sumOfDivisors + i;
}
}
if(number == sumOfDivisors)
{
System.out.println(number + " is a perfect number");
}
else
{
System.out.println(number + " is not a perfect number");
}
}
}