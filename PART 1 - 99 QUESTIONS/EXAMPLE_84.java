/**Previous year's assignment.*/

import java.util.*;
public class EXAMPLE_84
{
static int idno[]={1,2,3,4,5};
static String name[]={"Sahana","neetha","akshara","monica","Ashwaq"};
static String mobile[]={"8892196179","9481030320","7795539615","9481485910","9448834025"};
static String address[]={"bilekahalli","JP nagar ","Jaynagar ","Kengeri"  ," Bannerghatta "};
static long pin[]={560076,560070,560076,560070,560076};
static char di[]={'d','i','d','i','d'};
static char choice,domind;
static double bill,tbill;
static int id;
public static void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the ID number");
id=sc.nextInt();
int flag=0;
int i;
for(i=0;i<5;i++)
{
if(id==idno[i])
{
flag=1;
choice=di[i];
break;
}
}
if(flag==1)
{
System.out.println("***HI! WELCOME TO ELECTRIOCITY BILL GENERATION OFFICE-BILEKAHALLI***");
compute();
}
else
{
System.out.println("SORRY FOR THE INCONVIENIANCE.... YOU ARE NOT REGISTERED HERE");
System.out.println("PLEASE CALL 080-26485985 FOR MORE DETAILS");
}
}
public static void compute()
{
Scanner sc=new Scanner(System.in);
System.out.println("Dear customer");
System.out.println("Enter your present reading");
double pres=sc.nextDouble();
System.out.println("Enter your previous reading");
double prev=sc.nextDouble();
double unit=pres-prev;
System.out.println("Is your bill paid late");
System.out.println("Bill paid is declared late if it is paid after 17th of every month");
System.out.println("Enter yes if it is paid late and no if it is paid on or before the due date");
String late=sc.next();
System.out.println("CUSTOMER DETAILS");
System.out.println("Your name is:" +name[id-1]);
System.out.println("Your mobile number is:" +mobile[id-1]);
System.out.println("Your address is:" +address[id-1]);
domind=di[id-1];
if(domind=='d')
System.out.println("You are a domestic customer");
else
System.out.println("You are an industrial customer");
switch(choice)
{
case 'd':
if(unit<=100)
{
bill=unit*0.40;
}
else
if(unit>100&&unit<=300)
{
bill=100*0.40+(unit=100)*0.60;
}
else
{
bill=100*0.40+200*0.60+(unit-300)*1;
}
if(late=="yes")
{
tbill=bill+50;
}
else
{
tbill=bill;
}
System.out.println("DEAR CUSTOMER YOUR BILL IS:  "+tbill);
break;
case 'i':
if(unit<=100)
{
bill=unit*0.60;
}
else
if(unit>100&&unit<=300)
{
bill=100*0.60+(unit=100)*0.90;
}
else
{
bill=100*0.60+200*0.90+(unit-300)*1;
}
if(late=="yes")
{
tbill=bill+50;
}
else
{
tbill=bill;
}
System.out.println("DEAR CUSTOMER YOUR BILL IS:  "+tbill);
break;
default:
System.out.println("SORRY!!!! WRONG CHOICE");
}
System.out.println(" Save Energy Save Life");
System.out.println(" Have a nice day!!!");
System.out.println(" PLEASE VISIT AGAIN.......");
System.out.println("************THANK YOU************");
}
public static void main(String args[])
{
input();
}
}