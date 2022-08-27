/**Find the output.*/

public class EXAMPLE_24
{
public void Question_1()
{
int x=10;
int y=x++ + ++x-x--+2*x;
System.out.println("The value of y= "+y+" and the value of x= "+x+".");
}
public void Question_2()
{
int a=0,b=30,c=40;
a=--b + c++ + b;
System.out.println("The value of a= "+a+".");
}
public void Question_3()
{
int a=2,b=3,c=9;
int z=a-(b++)*(--c);
int y=a*(++b)%c;
System.out.println("The value of z= "+z+".");
System.out.println("The value of y= "+y+".");
}
public void Question_4()
{
int k=5,j=9;
k+=k++ - ++j + k;
System.out.println("The value of k= "+k+".");
System.out.println("The value of j= "+j+".");
}
public void Question_5()
{
double a=-6.35;
double b=14.74;
double x=Math.abs(Math.ceil(a));
double y=Math.rint(Math.max(a,b));
System.out.println("The value of x= "+x+".");
System.out.println("The value of y= "+y+".");
}
public void Question6()
{
int a,b=5,c=2;
a=++b + c++ + b*c+ --c + ++b;
System.out.println("The value of a= "+a+".");
}
}








