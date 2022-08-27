/**Write a program to accept three numbers and print the smallest one.*/

import java.util.*;
public class EXAMPLE_21
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter three numbers:-");
System.out.println("Enter the first number:-");
int n1=sc.nextInt();
System.out.println("Enter the second number:-");
int n2=sc.nextInt();
System.out.println("Enter the third number:-");
int n3=sc.nextInt();
if(n1<n2&&n1<n3)
{
System.out.println(n1+" is the smallest number out of the given numbers.");
}
else if(n2<n1&&n2<n3)
{
System.out.println(n1+" is the smallest number out of the given numbers.");
}
else if(n3<n2&&n3<n1)
{
System.out.println(n1+" is the smallest number out of the given numbers.");
}
else
{
System.out.println("It is a wrong choice of numbers.");
}
}
} 