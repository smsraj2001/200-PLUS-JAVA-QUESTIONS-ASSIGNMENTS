/**Polygon program.*/

import java.util.*;
public class EXAMPLE_190
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length:-");
int l=sc.nextInt();
System.out.println("Enter the breadth:-");
int b=sc.nextInt();
System.out.println("Enter a character for printing:-");
char ch1=sc.next().charAt(0);
for(int i=1;i<=b;i++)
{
for(int j=1;j<=l;j++)
{
System.out.print(ch1);
}
System.out.println();
}
System.out.println("Enter the side:-");
int a=sc.nextInt();
System.out.println("Enter one more character for printing:-");
char ch2=sc.next().charAt(0);
for(int i=1;i<=a;i++)
{
for(int j=1;j<=a;j++)
{
System.out.print(ch2+" ");
}
System.out.println();
}
}
}