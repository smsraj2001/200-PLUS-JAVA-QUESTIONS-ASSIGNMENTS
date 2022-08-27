/**Write a program to display the series 1,11,111,1111,11111.*/

import java.util.*;
public class PROGRAM15
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to display the series:-");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print("1");
}
System.out.print(",");
}
}
}   