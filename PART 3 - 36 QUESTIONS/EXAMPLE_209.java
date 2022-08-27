/**String program.*/

import java.util.*;
public class EXAMPLE_209
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a word:-");
String S=sc.next();
int l=S.length();
System.out.println("Enter a character to be searched for:-");
char ch=sc.next().charAt(0);
for(int i=0;i<l;i++)
{
char ch$=S.charAt(i);
if(ch$==ch)
System.out.print(ch$);
}
System.out.println();
System.out.println("\tSeries Program:-");
System.out.println("Enter the end term for the series:-");
int n=sc.nextInt(),a=0;
for(int i=1;i<=n;i++)
{
a=(int)Math.pow(i,i);
System.out.print(a+",");
}
System.out.println();
System.out.println('\u00AE');
System.out.println('\u0022');
System.out.println('\u00BD');
System.out.println('\u0394');
}
}