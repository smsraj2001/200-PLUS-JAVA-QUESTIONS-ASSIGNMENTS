/**Write a program with a class to overload a function num_cal() as follows:-
.1.)void num_cal(int num,char ch),with one integer arguments and one character arguments.
Compute the square of integer argument if,ch is 's' otherwise,find its cube..
.2.)void num_cal(int a,int b,char ch),with two integer arguments and one character argument.
Compute the product of integer arguments if,ch is 'p' otherwise add the integer...*/
 
import java.util.*;
public class EXAMPLE_54 
{
public void num_cal(int num,char ch)
{
int R1;
if(ch=='S'||ch=='s')
{
R1=num*num;
System.out.println("The square of "+num+" is "+R1+".");
}
else
{
R1=num*num*num;
System.out.println("The cube of "+num+" is "+R1+".");
}
}
public void num_cal(int a,int b,char ch)
{
int R2;
if(ch=='P'||ch=='p')
{
R2=a*b;
System.out.println("The product of "+a+" and "+b+" is "+R2+".");
}
else
{
R2=a+b;
System.out.println("The sum of "+a+" and "+b+" is "+R2+".");
}
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
EXAMPLE_54 obj=new EXAMPLE_54();
System.out.println("Enter 's' or 'S' to calculate the square of the number.");
System.out.println("\t\t\t\tOR");
System.out.println("Enter any other character to calculate the cube of the number.");
System.out.println("Enter a character:-");
char ch1=sc.next().charAt(0);
System.out.println("Enter the number:-");                                            
int num1=sc.nextInt();
obj.num_cal(num1,ch1);
System.out.println("Enter 'p' or 'P' to calculate the product of the numbers.");
System.out.println("\t\t\t\tOR");
System.out.println("Enter any other character to calculate the sum of the numbers.");
System.out.println("Enter a character:-");
char ch2=sc.next().charAt(0);
System.out.println("Enter the first number:-");
int a1=sc.nextInt();
System.out.println("Enter the second number:-");
int b1=sc.nextInt();
obj.num_cal(a1,b1,ch2);
}
}