/**Write a program for arithmetic progression.*/

import java.util.*;
public class EXAMPLE_195
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first term of the series:-");
int a=sc.nextInt();
System.out.println("Enter the common difference of the series:-");
int d=sc.nextInt();
System.out.println("Enter the number of terms of the series:-");
int n=sc.nextInt(); 
for(int i=1;i<=n;i++)
{
int AP=(a+((i-1)*d));
System.out.print(AP+" ");
}
}
}