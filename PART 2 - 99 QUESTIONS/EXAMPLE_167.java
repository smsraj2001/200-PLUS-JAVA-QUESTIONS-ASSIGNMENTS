/**Loop programs of java Preparatory : 2.*/

import java.util.*;
public class EXAMPLE_167
{
public static void display(int x,int y)
{
for(int i=x;i<=y;i++)
{
if(i%2!=0)
System.out.println("The odd number is "+i+".");
}
}
public static void display(char ch1,char ch2)
{
for(char i=ch1;i<=ch2;i++)
{
if(i=='A'||i=='E'||i=='I'||i=='O'||i=='U'||i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
{
}
else
System.out.println("The consonant is "+i+".");
}
}
public static void display(char ch,int n)
{
for(int i=n;i>=1;i--)
{
for(int j=1;j<=i;j++)
{
System.out.print(ch);
}
System.out.println();
}
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the starting number:-");
int x1=sc.nextInt();
System.out.println("Enter the ending number:-");
int y1=sc.nextInt();
display(x1,y1);
System.out.println("Enter the starting character:-");
char ch$1=sc.next().charAt(0);
System.out.println("Enter the ending character:-");
char ch$2=sc.next().charAt(0);
if(Character.isUpperCase(ch$1))
{
if(Character.isUpperCase(ch$2))
display(ch$1,ch$2);
else
System.out.println("Enter same cases.");
}
else if(Character.isLowerCase(ch$1))
{
if(Character.isLowerCase(ch$2))
display(ch$1,ch$2);
else
System.out.println("Enter same cases.");
}
System.out.println("Enter a character:-");
char ch_1=sc.next().charAt(0);
System.out.println("Enter the number for loop:-");
int n1=sc.nextInt();
display(ch_1,n1);
}
}