/**Write a program using function overloading with a function called ADD().*/
                                     
public class EXAMPLE_52
{
public void ADD(int x,int y)
{
System.out.println("The sum of "+x+" and "+y+" is "+(x+y)+".");
}
public void ADD(double x,double y)                                                                                                                                                                                                                                                                                   
{
System.out.println("The sum of "+x+" and "+y+" is "+(x+y)+".");
}
public void ADD(int x,int y,int z)
{
System.out.println("The sum of "+x+","+y+" and "+z+" is "+(x+y+z)+".");
}
public void ADD(String x,String y)
{
System.out.println("The statement if joined is "+(x+y)+".");
}
public void ADD(double x,int y)
{
System.out.println("The sum of "+x+" and "+y+" is "+(x+y)+".");
}
public static void main(String[]args)
{
EXAMPLE_52 obj=new EXAMPLE_52();
int p=4,q=5;
obj.ADD(p,q);
String s1="HAPPY";
String s2=" BIRTHDAY";
obj.ADD(s1,s2);
double p1=3.4,q1=4.55;
obj.ADD(p1,q1);
int x1=3,y1=656576,z1=565;
obj.ADD(x1,y1,z1);
double n1=2.567876567865446;
int n2=6766;
obj.ADD(n1,n2);
}
}