/**Write a program to a number is composite or not.*/

import java.util.*;
public class EXAMPLE_82
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:-");
int num=sc.nextInt();
int n=num,c=0;
for(int i=2;i<n;i++)
{
if(n%i==0)
c++;
}
if(c>=1)
{
System.out.println(num+" is a composite number.");
}
else
System.out.println(num+" is not a composite number.");
}
}
