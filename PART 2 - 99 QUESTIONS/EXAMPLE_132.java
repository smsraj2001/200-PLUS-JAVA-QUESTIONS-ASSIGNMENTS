/**A small code snippet of library management on date.*/

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
public class EXAMPLE_132
{
public static final DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
public static void main(String[]args)
{
Date currentDate=new Date();
String dt1=dateFormat.format(currentDate);
System.out.println("Borrowed date of the book is:-");
System.out.println(dt1);
Calendar c=Calendar.getInstance();
c.setTime(currentDate);
c.add(Calendar.DATE,7);
Date currentDatePlusOne=c.getTime();
String dt2=dateFormat.format(currentDatePlusOne);
System.out.println("Return date of the book is :-");
System.out.println(dt2);
}
}
