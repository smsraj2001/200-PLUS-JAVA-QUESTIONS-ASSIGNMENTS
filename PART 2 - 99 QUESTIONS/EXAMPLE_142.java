/**Write a program to print the series x^1-x^2+x^3-x^4......till n terms.*/

import java.util.*;
public class EXAMPLE_142
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of x:-");
int x=sc.nextInt();
System.out.println("Enter the number of terms of the series:-");
int n=sc.nextInt();
double p,sum=0;
int c=1;
for(int i=1;i<=n;i++)
{
p=(Math.pow(x,i))*c;
sum=sum+p;
c=c*-1;
}
System.out.println("The sum of the series is "+sum+".");
}
}

    