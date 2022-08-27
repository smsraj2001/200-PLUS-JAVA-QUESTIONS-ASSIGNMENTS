/**Return type function programs.*/

import java.util.*;
public class EXAMPLE_220
{
double area=0.0d;
public double area(int r)
{
area=Math.PI*r*r;
System.out.println("The area is "+area);
return area;
}
public double area(int l,int b)
{
area=l*b;
System.out.println("The area is "+area);
return area ;
}
public static void P()
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10],temp=0,pos=0,small;
System.out.println("Enter 10 numbers:-");
for(int i=0;i<10;i++)
a[i]=sc.nextInt();
System.out.println("The sorted array is:-");
for(int i=0;i<10;i++)
{
small=a[i];
pos=i;
for(int j=i+1;j<10;j++)
{
if(small>a[j])
{
small=a[j];
pos=j;
}
}
temp=a[i];
a[i]=a[pos];
a[pos]=temp;
}
for(int i=0;i<10;i++)
System.out.println(a[i]);
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
EXAMPLE_220 obj=new EXAMPLE_220();
double res=obj.area(7);
res=obj.area(9,10);
int a[]=new int[30],temp=0;
System.out.println("Enter 30 numbers:-");
for(int i=0;i<30;i++)
a[i]=sc.nextInt();
System.out.println("The sorted array is:-");
for(int i=0;i<30;i++)
{
for(int j=0;j<30-i-1;j++)
{
if(a[j]<a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
for(int i=0;i<30;i++)
System.out.println(a[i]);
}
}