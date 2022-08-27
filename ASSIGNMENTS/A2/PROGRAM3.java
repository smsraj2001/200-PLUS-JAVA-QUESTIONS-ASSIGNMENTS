/**Enter the value for three sides of a triangle and check it is which type of triangle:-
(Scalene,Isosceles or Equilateral triangle).*/

import java.util.*;
public class PROGRAM3   
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
System.out.println("The triangle with sides "+L1+" , "+L2+" and "+L3+" is an equilateral triangle.");
else if(L1==L2||L2==L3||L3==L1)
System.out.println("The triangle with sides "+L1+" , "+L2+" and "+L3+" is an isosceles triangle.");
else
System.out.println("The triangle with sides "+L1+" , "+L2+" and "+L3+" is an scalene triangle.");
}
}