/**Write a program to print the reverse pattern of EXAMPLE_139.*/

import java.util.*;
public class EXAMPLE_139
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String in uppercase:-");
String S=sc.next().toUpperCase();
int n=S.length(),c=1;
for(int i=n;i>=1;i--)
{
for(int k=1;k<=c;k++)
System.out.print(" ");
for(int j=1;j<=i;j++)
{
System.out.print(S.charAt(j-1)+" ");
}
System.out.println();
c=c+1;
}
}
}