/**Array program based on searching.*/

import java.util.*;
public class EXAMPLE_168
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number  of cities:-");
int n=sc.nextInt();
String city[]=new String[n];
int STD[]=new int[n];
for(int i=0;i<n;i++)
{
System.out.println((i+1)+". Enter the name of the city:-");
city[i]=sc.next();
System.out.println("Enter the STD code of "+city[i]+" :-");
STD[i]=sc.nextInt();
}
System.out.println("Enter 'STD' if you want to search city  by entering the STD code.");
System.out.println("Enter 'CITY' if you want to search STD  by entering the city.");
System.out.println("Enter your choice:-");
String ch=sc.next();
switch(ch)
{
case "STD" :
System.out.println("Enter the STD code of the city:-");
int S=sc.nextInt(),found=0;
String cy="";
for(int i=0;i<n;i++)
{
if(STD[i]==S)
{
found=1;
cy=city[i];
break;
}
}
if(found==1)
System.out.println("The city is "+cy+".");
else
System.out.println("Entered STD is not found and city didn't match.");
break;
case "CITY" :
System.out.println("Enter the name of the city:-");
String n1=sc.next();int found1=0;
int std=0;
for(int i=0;i<n;i++)
{
if(city[i].equalsIgnoreCase(n1))
{
found1=1;
std=STD[i];
break;
}
}
if(found1==1)
System.out.println("The STD code is "+std+".");
else
System.out.println("Entered city is not found and STD code didn't match.");
break;
default :
System.out.println("Wrong choice.");
break;
}
}
}
