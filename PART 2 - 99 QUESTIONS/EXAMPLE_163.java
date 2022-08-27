/**OUTPUT PROGRAMS.*/

import java.util.*;
public class EXAMPLE_163
{
public static void main(String[]args)
{
System.out.println("Output is "+1+2);
System.out.println("Output is "+1.5+3);
System.out.println("Output is "+10+'A');
System.out.println("Output is "+'a'+'b');
System.out.println("Output is "+5*4+5/4);
System.out.println("Output is "+(1+2+1.2+'A'));
System.out.println("Output is "+'a'+2);
System.out.println(12+'A'+" is the output");
System.out.println("The value is "+(12+3)+6.5);
{
System.out.println("Hello "+" World"+'d');
int x=-4,y=8,z;
z=x++ + ++y/x * ++x * y;
System.out.println(x+","+y+","+z);
}
{
int x=-4,y=8,z;
z=x++ + ++y/x * ++x * y;
System.out.println(x+","+y+","+z);
}
int k=-2,m=6;
k+=k-- + ++m / k++;
System.out.println("k= " + k +"m= "+m);
char c1='a',c2='z';
System.out.println(++c1 + c2++ + --c1 * c2--);
System.out.println(c1+" "+c2);
{
int a=1000,b=200,c=300;
a%=++a / ++b * ++c;
System.out.println(a+" "+b+" "+c);
}
{
int a=10,b=20,c=40;
if(a*b==c/4*b)
System.out.println(a++ +" "+(++b)+" "+(c++));
System.out.println(a+" "+b+" "+c);
}
int x=10,y=2;
if(x==y);
System.out.println(x+y);
int p=12,q=10;
p+=((p+q)%10==0)?p++ + q++:p-- - q--;
System.out.println("p= "+p+"\nq= "+q);
int a=1,b=2;
if(a<b)System.out.println(a++);
if(a>=b)System.out.println(b++);
System.out.println(a+" "+b);
int op=2;
switch(op++)
{
case 2: System.out.println("The value of op ="+op);
case 3:op*=op++;System.out.println("The value of op="+op); break;
default: System.out.println("The value of op="+op);
System.out.println(Math.sqrt(6/3));
System.out.println(Math.abs(Math.ceil(-34.567)));
System.out.println(Math.pow(Math.sqrt(4),Math.max(5,2.3)));
System.out.println(Math.floor(-4.5));
System.out.println(Math.rint(-5.67));
System.out.println(Math.min(Math.max(100,-50),Math.min(-20,-30)));
System.out.println(Math.random());
System.out.println((int)(Math.random()*10));
System.out.println(Math.floor(Math.ceil(Math.abs(-56.998))));
Scanner sc=new Scanner(" I'm confident to face the challenge");
System.out.println(sc.next());
System.out.println(sc.next());
System.out.println(sc.nextLine());
}
P();
}
public static void P()
{
Scanner sc=new Scanner("1 2 3 4 5");
while(sc.hasNextInt())
{
System.out.println(sc.nextInt());
}
}
}