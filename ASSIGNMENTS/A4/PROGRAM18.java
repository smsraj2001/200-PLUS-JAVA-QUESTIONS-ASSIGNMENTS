/**Write a program to display the sum of the series 1/1 + 1/2 + 1/3 + ,etc....*/

import java.util.*;
public class PROGRAM18
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of terms for the series:-");
int N=sc.nextInt();
double num=1,den=1,quo,sum=0;
for(int i=1;i<=N;i++)
{
quo=(double)(num/den);
sum=(double)sum+quo;
System.out.print(quo+",");
den=den+1;
}
System.out.println();
System.out.println("The sum of the series is "+sum+".");
}
} 