/**Revision program.*/

import java.util.*;
public class EXAMPLE_164
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence:-");
String S=sc.nextLine(),S2="";
S=S+" ";
int l=S.length(),index=0,count=0;
for(int i=0;i<l;i++)
{
if(S.charAt(i)==' ')
{
S2=S.substring(index,i);
count=count+1;
System.out.println(S2);
index=i+1;
}
}
System.out.println("\"Number of words is\""+count+".");
int c=l-1;
for(int i=1;i<=l;i++)
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
c=1;
for(int i=l-1;i>=1;i--)
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
System.out.println("Enter a number:-");
int n=sc.nextInt();
String S3=Integer.toString(n);
String S4="Java";
String S5=S3+S4;
System.out.println(S5);
int a=1,b=2,c1=3;
a+=b+=c1;
System.out.println("A "+a);
System.out.println("B "+b);
}
public EXAMPLE_164(int m,int n)
{
m=3;n=4;
System.out.println(m+"\t"+n);
}
public EXAMPLE_164()
{
this(0,0);
}
public static void pattern()
{
int x=-10,n=0;
boolean b=true;
while(b)
{
if(x<0)
{
x++;
n++;
continue;
}
else
break;
}
System.out.println(n);
System.out.println(x);
String p="Honesty",q="Best",r="Policy";
System.out.println(r.charAt(0)+r.charAt(2));
System.out.println((p.substring(0,3)+q.substring(1)).toUpperCase());
String st="WELCOME TOPPERS";
System.out.println(Character.isUpperCase(st.charAt(7)));
int a[]={2,4,6,8,0,1};
for(int i=0;i<=1;i++)
{
int s=a[i]+a[3-i];
System.out.println(s);
}
}
}