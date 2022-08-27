/**Write a program to check number is Automorphic number or not.*/
 
import java.util.*;
public class EXAMPLE_79
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number to check Automorphic or not : ");
int number = sc.nextInt();
int n=number;
int digits=0;
int rem;
while(n!=0)
{
rem=n%10;
digits = digits+ 1;
n=n/10;
}
int numberSquare = number * number;
System.out.println("Square of number is "+numberSquare);
int lastDigits = (int) (numberSquare % (Math.pow(10, digits)));
if(number == lastDigits) 
{
System.out.println("It is a Automorphic Number");
} 
else
{
System.out.println("It is not a Automorphic Number");
}
}
}