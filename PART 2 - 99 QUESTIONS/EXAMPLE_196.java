/**Write a program for geometric progression.*/

import java.util.*;
public class EXAMPLE_196
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first term of the series:-");
long a=sc.nextLong();
System.out.println("Enter the common ratio of the series:-");
long r=sc.nextLong();
System.out.println("Enter the number of terms of the series:-");
long n=sc.nextLong(); 
for(long i=1;i<=n;i++)
{
long GP=(long)(a*Math.pow(r,i-1));
System.out.print(GP+" ");
}
}
}