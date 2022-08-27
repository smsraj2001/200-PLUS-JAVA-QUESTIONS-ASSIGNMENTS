/**Write a program to check whether a number is fascinating number or not.*/

import java.util.*;
public class EXAMPLE_177
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:-");
int n=sc.nextInt();
int a=n*1;
int b=n*2;
int c=n*3;
String a1=Integer.toString(a);
String b1=Integer.toString(b);
String c$=Integer.toString(c);
String p=a1+b1+c$;
int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;
if(n>=100)
{
for(int i=0;i<p.length();i++)
{
char ch=p.charAt(i);
if(ch=='1')
c1++;
else if(ch=='2')
c2++;
else if(ch=='3')
c3++;
else if(ch=='4')
c4++;
else if(ch=='5')
c5++;
else if(ch=='6')
c6++;
else if(ch=='7')
c7++;
else if(ch=='8')
c8++;
else if(ch=='9')
c9++;
}
if(c1==1&&c2==1&&c3==1&&c4==1&&c5==1&&c6==1&&c7==1&&c8==1&&c9==1)
System.out.println(n+" is a Fascinating number.");
else
System.out.println(n+" is not a Fascinating number.");
}
else
System.out.println("Enter a valid 3 digit number or more.");
}
}