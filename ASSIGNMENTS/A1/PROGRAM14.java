


/**Write a program to calculate simple interest.*/

import java.util.*;
public class PROGRAM14
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of principal:-");
double P=sc.nextDouble();
System.out.println("Enter the value of time:-");
int T=sc.nextInt();
System.out.println("Enter the value of rate%:-");
int R=sc.nextInt();
double SI;
SI=(double)(P*T*R)/100;
System.out.println("The simple interest is Rs:"+SI+".");    
    }
}
