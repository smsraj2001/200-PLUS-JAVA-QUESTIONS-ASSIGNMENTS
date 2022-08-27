/**Loop based programs.*/

import java.util.*;
public class EXAMPLE_153
{
public static void P1()
{
System.out.println("                 PROGRAM : 1");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of x:-");
int x=sc.nextInt();
System.out.println("Enter the end term of the series:-");
int n=sc.nextInt();
double sum=0;
for(int i=2;i<=n;i=i+3)
{
sum=sum+(x/i);
}
System.out.println("The sum of the series is "+sum+".");
}
public static void P2()
{
System.out.println("                 PROGRAM : 2");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the end term of the series:-");
int n=sc.nextInt();
int c=1;
double sum=0;
for(int i=0;i<=n;i++)
{
sum=(sum+2)*c;
c=c*-1;
}
System.out.println("The sum of the series is "+sum+".");
}
public static void P3()
{
System.out.println("                 PROGRAM : 3");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the end term of the series:-");
int n=sc.nextInt();
double sum=0,sumT=0;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
sum=sum+j;
}
sumT=sumT+sum;
}
System.out.println("The sum of the series is "+sum+".");
}
public static void P4()
{
System.out.println("                 PROGRAM : 4");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of x:-");
int x=sc.nextInt();
System.out.println("Enter the end term of the series:-");
int n=sc.nextInt();
int m=10;
double sum=0,sumT=0,fact=1;
for(int i=1;i<=n;i++)
{
fact=1;
for(int j=1;j<=x;j++)
{
fact=fact*j;
}
sum=(fact)/m;
m=m+5;
sumT=sumT+sum;
x=x+2;
}
System.out.println("The sum of the series is "+sumT+".");
}
public static void P5()
{
System.out.println("                 PROGRAM : 5");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number for pattern:-");
int n=sc.nextInt();
int a=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(a+" ");
a=a+1;
}
System.out.println();
}
}
public static void P6()
{
System.out.println("                 PROGRAM : 6");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number for pattern:-");
int n=sc.nextInt();
int a='a';
char ch=(char)a;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(ch+" ");
a=a+1;
ch=(char)a;
}
System.out.println();
}
}
public static void P7()
{
System.out.println("                 PROGRAM : 7");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number for pattern:-");
int n=sc.nextInt();
int a='A';
char ch=(char)a;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print((char)ch+" ");
a=a+1;
ch=(char)a;
}
System.out.println();
}
}
public static void P8()
{
System.out.println("                 PROGRAM : 8");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number for pattern:-");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
if(j%2==0)
System.out.print("@");
if(j%3==0)
System.out.print("&");
else
System.out.print("*");
}
System.out.println();
}
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 for Series programs.");
System.out.println("Enter 2 for Pattern programs.");
System.out.println("Enter 3 for All programs.");
System.out.println("Enter your choice:-");
int n=sc.nextInt();
switch(n)
{
case 1 :
System.out.println("                     SERIES");
P1();
P2();
P3();
P4();
break;
case 2 :
System.out.println("                     PATTERN");
P5();
P6();
P7();
P8();
break;
case 3 :
P1();
P2();
P3();
P4();
P5();
P6();
P7();
P8();
break;
default :
System.out.println("Invalid choice.Enter 1,2 or 3.");
}
}
}