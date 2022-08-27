/**Enter the value for three sides of a triangle and check it is which type of triangle:-
(Scalene,Isosceles or Equilateral triangle).*/

import java.util.*;
public class EXAMPLE_12
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of first length:-");
int L1=sc.nextInt();
System.out.println("Enter the value of second length:-");
int L2=sc.nextInt();
System.out.println("Enter the value of third length:-");
int L3=sc.nextInt();
if(L1==L2&&L2==L3&&L3==L1)
System.out.println("This triangle is an Equilateral triangle.");
else if(L1==L2||L2==L3||L3==L1)
System.out.println("This triangle is an Isosceles triangle.");
else
System.out.println("This triangle is a Scalene triangle.");    
/**S.o.p if statement for Scalene triangle is:-
if(L1!=L2&&L2!=L3&&L3!=L1)*///!= means 'not equal to'.....
/**?System.out.printn("This triangle is a Scalene triangle");*/
}
}