/**Worksheet programs.*/

import java.util.*;
import java.lang.*;
public class EXAMPLE_213
{
public static void Q1()
{
System.out.println("QUESTION 1:-");
int a=5,b=6,c=2;
System.out.println(a+b%c-a*b);
System.out.println(c/a+c%a);
}
public static void Q2()
{
System.out.println("QUESTION 2:-");
int x=-4,y=-2;
x*=x++ + y++ - ++x;
System.out.println("x= "+x+"\ny="+y);
}
public static void Q3()
{
System.out.println("QUESTION 3:-");
char x='B';
int y=5;
System.out.println(x++%y++ + ++x);
System.out.println(x+" , "+y);
}
public static void Q4()
{
System.out.println("QUESTION 4:-");
int m=100,n=150,k=200;
System.out.println("Output is "+(m%10==n%10));
System.out.println("Output is "+!(k>m||k%m==0));
}
public static void Q5()
{
System.out.println("QUESTION 5:-");
int a=20,b=18;
char c='a',c1='b';
System.out.println("Examination "+a+b);
System.out.println("Output is "+a+c);
System.out.println("Output is "+(a+c));
System.out.println(a+c+" is the output.");
System.out.println(c++);
System.out.println(c + b++);
System.out.println(c+" "+b);
a=b=++a;
System.out.println(a+" "+b);
}
public static void Q6()
{
System.out.println("QUESTION 6:-");
int x=1000,y=500;
if(x+y%3==0)
System.out.println(x+=y);
else
System.out.println(x-=y);
}
public static void Q8()
{
System.out.println("QUESTION 8:-");
int x=10,y=-5;
if(x>0)
if(y>0)
System.out.println(x+" "+y);
else
System.out.println(Math.abs(y)+x);
else
System.out.println(Math.abs(x)+Math.abs(y));
}
public static void Q9()
{
System.out.println("QUESTION 9:-");
int x=10,y=2,n=0;
while(y<=x)
{
System.out.println(x+" , "+y);
if(x%++y==0)
break;
n++;
}
System.out.println(n+" times");
n=0;
char c='a';
do
{
System.out.println(c++);
if(c%10==0)
break;
n++;
}while(true);
System.out.println(n+" times");
n=0;
for(int a=100;a>=1;a-=10)
{
if(a%4==0)
continue;
n++;
System.out.println(a);
n++;
}
System.out.println(n+" times");
n=0;
for(int i=1;i<3;i++)
{
for(int j=1;j<6;j++)
{
System.out.println(i+","+j);
if(j%2==0)
break;
}
}
}
public static void Q10()
{
System.out.println("QUESTION 10:-");
System.out.println(Math.ceil(-6.5));
System.out.println(Math.sqrt(Math.pow(100%10,4)));
System.out.println(Math.floor(Math.abs(-8.997)));
System.out.println((int)(Math.random()*10));
System.out.println(Math.rint(5.78));
System.out.println(Math.max(-10,-100)+Math.min(10,10/20));
}
public static void Q11()
{
System.out.println("QUESTION 11:-");
String x="Fun World",y="Water World";
System.out.println(x.length()+y.length());
System.out.println(x.charAt(y.length()/2));
System.out.println(y.indexOf('W',1));
System.out.println(x.lastIndexOf('N'));
System.out.println(x.substring(0,4).concat("Cinemas"));
System.out.println(x.compareTo(y));
System.out.println(y.substring(6).toUpperCase());
System.out.println(x.substring(5,x.length()));
System.out.println("Independence".replace('e','E'));
}
public static void Q12()
{
System.out.println("QUESTION 12:-");
String s="12345",s1="13.456";
int x=12;
double y=33.451;
System.out.println(Integer.parseInt(s)/10+Integer.valueOf(s)%10);
System.out.println(s.length()+s1.length());
System.out.println(s.compareTo(s1));
System.out.println(s1.indexOf('.'));
System.out.println(Character.isLetter(s1.charAt(2)));
System.out.println(Character.isUpperCase((char)(97-32)));
System.out.println(Character.toLowerCase("ABCD".charAt(3)));
System.out.println(Integer.toString(x)+String.valueOf(y));
System.out.println(Integer.toString((int)y).lastIndexOf('3'));
System.out.println(Character.isWhitespace('\n'));
System.out.println(Character.isLetterOrDigit('8'));
System.out.println(Double.parseDouble(s));
System.out.println(Integer.parseInt(s)/1000);
}
public static void Q13()
{
System.out.println("QUESTION 13:-");
int a[]={10,20,22,24,32,44};
char b[]={'a',65,98,'$','6','w','x','y'};
String c[]={"MICROMAX","SAMSUNG","NOKIA","RELIANCE"};
System.out.println(a[0]++ + a[a.length-1]-- + a[0]+a[5]);
System.out.println(b.length+c.length);
for(int i=c.length-1;i>=c.length/2;i--)
System.out.println(c[i]);
System.out.println(c[1].toLowerCase().charAt(3));
System.out.println(c[0].startsWith("MIc"));
System.out.println(c[2].compareTo("NOISE"));
System.out.println(b[1]+" "+b[3]);
++b[5];
System.out.println(b[5]==b[6]);
System.out.println((int)b[4]);
System.out.println(Character.isUpperCase(b[2]));
System.out.println(a[0]+a[2]%a[3]==a[4]?a[4]/2:a[4]/3);
}
public static void Q17()
{
System.out.println("QUESTION 17:-");
class Exam
{
int x,y;
int a,b;
public Exam(int a,int b)
{
this.a=a;
this.b=b;
}
public void display()
{
int c=a++ + b++;
System.out.println(c);
System.out.println(a+b);
}
public void main()
{
Exam e=new Exam(100,50);
e.display();
}
}
}
public static void Q()
{
String s="MALAYALAM";
int n=s.indexOf(4,'A');
System.out.println(n);
}
public static void main(String[]args)
{
System.out.println("\"\\\\ICSE EXAMINATION 2018//\".");
Scanner sc=new Scanner(System.in);
System.out.println("MALAYALAM".indexOf(4,'A'));
System.out.println("MALAYALAM".indexOf('A',4));
Q1();
Q2();
Q3();
Q4();
Q5();
Q6();
Q8();
Q9();
Q10();
Q11();
Q12();
Q13();
Q17();
Q();
}
}