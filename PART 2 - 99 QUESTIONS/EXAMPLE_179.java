/**Write a program to calculate the rent of the bike.*/

import java.util.*;
public class EXAMPLE_179
{
public static int bno=0;
public static long phno=0;
public static String name="";
public static int days=0;
public static int charge=0;
public static void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of the customer:-");
name=sc.next();
System.out.println("Enter the phone number of Mr. "+name+":-");
phno=sc.nextLong();
System.out.println("Enter the number of the bike taken:-");
bno=sc.nextInt();
System.out.println("Enter the number of days the bike was taken:-");
days=sc.nextInt();
}
public static void compute()
{
if(days<=5)
charge=days*500;
else if(days<=10)
charge=5*500+((days-5)*400);
else
charge=5*500+5*400+((days-10)*200);
}
public static void display()
{
System.out.println("BIKE NUMBER"+"\t"+"PHONE NUMBER"+"\t"+"NAME"+"\t"+"NUMBER OF DAYS"+"\t"+"CHARGE");
System.out.println(bno+" \t "+phno+" \t "+name+" \t "+days+" \t "+charge);
}
public static void main(String[]args)
{
input();
compute();
display();
}
}