/**Write a complete java program to calculate the average of three numbers passed to a method 
'AVG',which returns the result to main().*/

import java.util.*;
public class EXAMPLE_49
{
public int AVG(int a1,int b1,int c1)
{
int A=(a1+b1+c1)/3;
return A;
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter three numbers:-");
System.out.println("Enter the first number:-");
int a=sc.nextInt();
System.out.println("Enter the second number:-");
int b=sc.nextInt();
System.out.println("Enter the third number:-");
int c=sc.nextInt();
EXAMPLE_49 obj=new EXAMPLE_49();
int AV=obj.AVG(a,b,c);
System.out.println("The average of "+a+","+b+" and "+c+" is "+AV+".");
}
}
   