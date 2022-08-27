/**Pattern program.*/

import java.util.*;
public class EXAMPLE_205
{
public static void main(String[]args)
{
Pattern1();
Pattern2();
Pattern3();
Pattern4();
}
public static void Pattern1()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a word:-");
String S=sc.next().toUpperCase();
int n=S.length();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n;j++)
{
System.out.print(S.charAt(j-1)+" ");
}
System.out.println();
}
}
public static void Pattern2()
{
Scanner sc=new Scanner(System.in);
int i,j;
for(i=1;i<=6;i++)
{
for(j=i;j<=6;j++)
{
System.out.print(j+" ");
}
System.out.println();
}
}
public static void Pattern3()
{
//bluej
Scanner sc=new Scanner(System.in);
System.out.println("Enter a word:-");
String S=sc.next().toUpperCase(),p="";
int n=S.length(),i,j;
for(i=0;i<n;i++)
{
for(j=i;j<n;j++)
{
p=p+S.charAt(j);
}
System.out.print(p+S.substring(0,i));
System.out.println();
p="";
}
}
public static void Pattern4()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows:-");
int row=sc.nextInt();
System.out.println("Enter the number of columns:-");
int col=sc.nextInt();
System.out.println("Enter the character:-");
char ch=sc.next().charAt(0);
for(int i=1;i<=row;i++)
{
for(int j=1;j<=col;j++)
{
System.out.print(ch);
}
System.out.println();
}
}
}