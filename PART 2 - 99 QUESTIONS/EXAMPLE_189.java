/**Write a program to compute a cosine series.*/

import java.util.*;
public class EXAMPLE_189
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of x:-");
int x=sc.nextInt();
System.out.println("Enter the number of term for he series:-");
int n=sc.nextInt();
int c=-1,d=2,fact=1,y=2;
double sum=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=d;j++)
fact=fact*j;
System.out.println("FACT: "+fact);
double x1=((Math.pow(x,y))/fact)*c;
sum=sum+x1;
c=c*-1;
System.out.println("Sum : "+sum);
y=y+2;
d=d+2;
fact=1;
}
System.out.println("The sum of the cosine series is "+sum+".");
}
}
