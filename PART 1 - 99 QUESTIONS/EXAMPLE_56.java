/**WORKSHEET 2:-
Write a program in java to interchange the value(swap) of the two numbers a and b and 
display the result after swapping.Use overloaded methods display(int,int) and display(float,
float) for swapping integer and float type values.*/
 
import java.util.*;
public class EXAMPLE_56
{
public static void display(int a1,int b1)
{
System.out.println("The initial values of a and b is "+a1+","+b1+".");
int T=a1;
a1=b1;
b1=T;
System.out.println("The values of a and b after the swap is "+a1+","+b1+".");
}
public static void display(float a2,float b2)
{
System.out.println("The initial values of a and b is "+a2+","+b2+".");
float T=a2;
a2=b2;
b2=T;
System.out.println("The values of a and b after the swap is "+a2+","+b2+".");
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
EXAMPLE_56 obj=new EXAMPLE_56();
System.out.println("          WORKSHEET : 2");
System.out.println("Enter the first int number:-");
int a=sc.nextInt();
System.out.println("Enter the second int number:-");
int b=sc.nextInt();
obj.display(a,b);   
System.out.println("Enter the first float number:-");
float a3=sc.nextFloat();
System.out.println("Enter the second float number:-");
float b3=sc.nextFloat();
obj.display(a3,b3); 
}
}  