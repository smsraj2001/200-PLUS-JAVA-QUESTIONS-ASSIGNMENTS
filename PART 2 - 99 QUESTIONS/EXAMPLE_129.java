/**A small code snippet of library management on date.*/
 
import java.util.*;
public class EXAMPLE_129
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
Calendar c=Calendar.getInstance();
long d1=c.get(Calendar.DATE);
long m1=c.get(Calendar.MONTH)+1;
long y1=c.get(Calendar.YEAR);
System.out.println("Today is "+d1+"/"+m1+"/"+y1);
System.out.println("The date to return the book is:-");
long d2=c.get(Calendar.DATE+7);
System.out.println("Return date "+d2+"/"+m1+"/"+y1);
}
}
   