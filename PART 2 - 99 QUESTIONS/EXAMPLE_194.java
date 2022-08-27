/**Write a program to print the sum of 2-4+6-8......to n.*/ 

import java.util.*;
public class EXAMPLE_194
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a end term for the series:-");
int n=sc.nextInt(),c=1,sum=0,m=0;
if(n%2==1)
{
System.out.println("Enter a even number.");
System.exit(0);
}
for(int i=2;i<=n;i=i+2)
{
m=i*c;
sum=sum+m;
c=c*-1;
}
System.out.println("The sum of the series is "+sum+".");
}
}