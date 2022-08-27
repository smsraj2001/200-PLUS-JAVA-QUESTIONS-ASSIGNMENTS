/**Define a constructor function for a Date class that initializes the Date objects with given
initial values.In case initial values are not provided,it should initialize the object with 
default values.*/

import java.util.*;
public class PROGRAM3 //Date
{
public static int dd,mm,yy;
public PROGRAM3()
{
dd=0;
mm=0;
yy=0;
}
public PROGRAM3(int d,int m,int y)
{
dd=d;
mm=m;
yy=y;
}
public static void UseDate()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the date:-");
int d1=sc.nextInt();
System.out.println("Enter the month:-");
int m1=sc.nextInt();
System.out.println("Enter the year:-");
int y1=sc.nextInt();
PROGRAM3 obj1=new PROGRAM3(d1,m1,y1);
System.out.println("The format is :-");
System.out.println(obj1.dd+"/"+obj1.mm+"/"+obj1.yy);
PROGRAM3 obj2=new PROGRAM3();
System.out.println("The format is :-");
System.out.println(obj2.dd+"/"+obj2.mm+"/"+obj2.yy); 
}
public static void main(String[]args)
{
PROGRAM3 obj=new PROGRAM3();
obj.UseDate();
}
}        