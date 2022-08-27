/**Write a program to display the first 10 terms of Fibonacci series.*/

public class PROGRAM16
{
public static void main(String[]args)
{
int n=10,a=0,b=1,c=0;
System.out.println("The numbers in fibbonacci series is :-");
System.out.println(a);
System.out.println(b);
for(int i=1;i<=n-2;i++)
{
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}