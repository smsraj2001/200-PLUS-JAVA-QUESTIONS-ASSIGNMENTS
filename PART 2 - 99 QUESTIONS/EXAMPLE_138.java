/**Write a program to display the following series:-
INPUT : ICSE
OUTPUT : I 
        I C 
       I C S 
      I C S E     */ 

import java.util.*; 
public class EXAMPLE_138
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String in uppercase:-");
String S=sc.next().toUpperCase();
int n=S.length(),c=n-1;
for(int i=1;i<=n;i++)
{
for(int k=1;k<=c;k++)
System.out.print(" ");
for(int j=1;j<=i;j++)
{
System.out.print(S.charAt(j-1)+" ");
}
System.out.println();
c=c-1;
}
}
}


