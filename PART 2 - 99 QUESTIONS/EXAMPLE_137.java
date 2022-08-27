/**Write a program to display the following series:-
     I
    I C
   I C S
  I C S E */

public class EXAMPLE_137
{
public static void main(String[]args)
{
String S="ICSE";
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

