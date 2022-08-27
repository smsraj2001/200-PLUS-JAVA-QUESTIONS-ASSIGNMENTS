/**Write a program to increament the salary by 15% for n number of employees.*/

import java.util.*;
public class EXAMPLE_211
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of employees:-");
int l=sc.nextInt();
String emp[]=new String[l];
int sal[]=new int[l];
double inc_sal[]=new double[l];
for(int i=0;i<l;i++)
{
System.out.println(i+1+") Enter the name of the employee:-");
emp[i]=sc.next();
System.out.println("Enter the salary of "+emp[i]+":-");
sal[i]=sc.nextInt();
}
System.out.print("SL.NO"+"\t"+"NAME"+"\t"+"BASIC SALARY"+"\t"+"SALARY AFTER INCREMENT");
System.out.println();
for(int i=0;i<l;i++)
{
inc_sal[i]=sal[i]+(0.15*sal[i]);
System.out.print(i+1+")"+"\t"+emp[i]+"\t\t"+sal[i]+"\t\t"+inc_sal[i]);
System.out.println();
}     
}
}