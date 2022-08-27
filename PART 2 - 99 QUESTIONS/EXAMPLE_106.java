/**Write a program to find whether number is a composite number or not.*/

import java.util.*;
public class EXAMPLE_106
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:-");
int num=sc.nextInt();
int count=0;
for(int i=1;i<=num;i++)
{
if(num%i==0)
count=count+1;
}
if(count>=3)
System.out.println(num+" is a composite number.");
else
System.out.println(num+" is not a composite number.");
}
}
  