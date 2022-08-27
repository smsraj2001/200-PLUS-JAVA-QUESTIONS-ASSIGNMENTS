
import java.util.*;
public class EXAMPLE_70
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 for pattern formation(*):-");
System.out.println("Enter 2 for pattern formation(a,b,etc...):-");
System.out.println("Enter your choice:-");
int ch=sc.nextInt();
switch(ch)
{
case 1 :
System.out.println("Enter the number for loop:-");
int n=sc.nextInt();
for(int i=0;i<=n;i++)
{
System.out.println();
for(int j=0;j<i;j++)
{
System.out.print("*");
}
}
case 2 :
System.out.println("Enter an alphabet:-");
char Char=sc.next().charAt(0);
System.out.println(Char);
do
{
System.out.println(Char);
Char++;
}
while(Char<='Z');
}
}
}