/**Find the output.Pg :523 and 524.*/

import java.util.*;
public class EXAMPLE_41
{
public void Question4()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a :-");
int a=sc.nextInt();
if(a==5)
System.out.println("Five");
else
System.out.println("Not Five");
}
public void Question5()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a year:-");
int year=sc.nextInt();
if(year%100==0)
if(year%400==0)
System.out.println("LEAP");
else
System.out.println("Not a century year.");
}
public void Question6()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a year:-");
int year=sc.nextInt();
if(year%100==0)
{
if(year%400==0)
System.out.println("LEAP");
}
else
System.out.println("Not a century year.");
}
public void Question10()
{
Scanner sc=new Scanner(System.in);
char ch='b';
switch(ch)
{
case 'a' :
System.out.print(ch);
case 'b' :
System.out.print(ch);
case 'c' :
System.out.print(ch);
case 'd' :
System.out.print(ch);
}
}
public void Question11()
{
double temperature=50;
if(temperature>=100)
System.out.println("too hot");
else if(temperature<=40)
System.out.println("too cold");
else
System.out.println("just rights");
}
public void Question12()
{
char c='a';
switch(c)
{
case 'a' :System.out.print("1");
case 'b' :System.out.print("2");
case 'c' :System.out.print("3");
}
System.out.println("Done");
}
/**From page no:524.*/
public void Question20()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a character:-");
char c=sc.next().charAt(0);
char ch='0';
switch(ch)
{
case 'A' :System.out.println("Grade A");
case 'B' :System.out.println("Grade B");
case 'C' :System.out.println("Grade C");
break;
case 'D' :System.out.println("Grade D");
default:System.out.println("Grade F");
}
}
//Question 24.
public static void ifElseTest(int a,int b)
{
if(a<b)
{
a=a*2;
}
if(a>b)
{
a=a-10;
}
else
{
b++;
}
System.out.println(a+" "+b);
}
}    