/**Write a program to check whether a number is an automorphic number or not.*/

import java.util.*;
public class EXAMPLE_107
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:-");
int num=sc.nextInt();
int n=num,d=0,r=0,sq=num*num,ld=0;
while(n>0)
{
r=n%10;
d=d+1;//count number of digits.
n=n/10;
}
System.out.println("The square of "+num+" is "+sq+".");
ld=(int)(sq%(Math.pow(10,d)));
if(num==ld)
System.out.println(num+" is an automorphic number.");
else
System.out.println(num+" is not an automorphic number.");
}
}