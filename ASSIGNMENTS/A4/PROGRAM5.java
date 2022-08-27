/**Write a program to display the cube root values from 1 to N:-*/

import java.util.*;
public class PROGRAM5
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the end number for the cube root:-");
int N=sc.nextInt();
for(int i=1;i<=N;i++)
{
double cb_root=Math.cbrt(i);
System.out.println("The cube root of "+i+" is "+cb_root+".");
}
}
}