/**Write a program that yyyy mm dd of two dates and then finds the differencenbetween these two dates
in terms of milliseconds,seconds,minutes,hours and days.
Note: You may use getTimeIn Millis() method of a calendar object to get calendar object in 
millisecond.*/

import java.util.*;
public class EXAMPLE_69
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int yyyy1=0,mm1=0,dd1=0,yyyy2=0,mm2=0,dd2=0;
System.out.println("Enter Date1:-");
try{
System.out.println("Enter year of date1 in yyyy format:-");
yyyy1=sc.nextInt(); 
System.out.println("Enter month of date1 in mm format:-");
mm1=sc.nextInt(); 
System.out.println("Enter date of date1 in dd format:-");
dd1=sc.nextInt();
System.out.println("Now Enter Date2:-");
System.out.println("Enter year of date2 in yyyy format:-");
yyyy2=sc.nextInt(); 
System.out.println("Enter month of date2 in mm format:-");
mm2=sc.nextInt(); 
System.out.println("Enter date of date2 in dd format:-");
dd2=sc.nextInt(); 
}
catch(Exception e)
{
System.out.println("Error in data entry.");
System.out.println("Exception : "+e);
return;
}
CD(yyyy2,mm2,dd2,yyyy1,mm1,dd1);
}
public static void CD(int y2,int m2,int d2,int y1,int m1,int d1)
{
Calendar calendar1=Calendar.getInstance();
Calendar calendar2=Calendar.getInstance();
calendar1.set(y1,m1,d1);
calendar2.set(y2,m2,d2);
long millisec1=calendar1.getTimeInMillis();
long millisec2=calendar2.getTimeInMillis();
long diff=millisec2-millisec1;
long diffsec=diff/1000;
long diffmin=diff/(60*1000);
long diffhours=diff/(60*60*1000);
long diffday=diff/(24*60*60*1000);
System.out.println("Difference in two different dates is:-");
System.out.println("Time in milliseconds: "+diff+" milliseconds.");
System.out.println("Time in seconds: "+diffsec+" seconds.");
System.out.println("Time in minutes: "+diffmin+" minutes.");
System.out.println("Time in hours: "+diffhours+" hours.");
System.out.println("Time in days: "+diffday+" days.");
}
}    