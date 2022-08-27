/**Pattern program.*/

import java.util.*;
public class EXAMPLE_191
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number for terms of series(1 to 18):-");
int n=sc.nextInt();
System.out.println("Enter a digit to be multiplied with(1 to 9):-");
int s=sc.nextInt();
if(s<=0||s>=10)
{
System.out.println("Invalid....Enter any number between 1 and 9.");
System.exit(0);
}
long rp=0;
if(n>=1&&n<=18)
{
for(long i=1;i<=n;i++)
{
rp=(long)((Math.pow(10,i)-1)/9)*s;
System.out.println(rp);
}
}
else
System.out.println("Invalid number.........Enter any number between 1 and 18.");
}
}