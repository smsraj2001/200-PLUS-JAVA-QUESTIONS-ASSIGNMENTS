/**Write a program to store 10 cities names in an array and:-
(i)Find a particular city.
(ii)Arrange them in ascending order.    */

import java.util.*;
public class PROGRAM7
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 10 cities in the array:-");
String city[]=new String[10],temp;
int l=city.length,found=0,i,j;
for(i=0;i<l;i++)
city[i]=sc.next();
System.out.println("Enter the city to be searched for:-");
String search=sc.next();
for(i=0;i<l;i++)
{
if(search.equalsIgnoreCase(city[i])==true)
{
found=1;
break;
}
}
if(found==1)
System.out.println(search+" exists in the array"+".");
else
System.out.println(search+" does not exists in the array"+".");
//Ascending order:-
for(i=0;i<l;i++)
{
for(j=i+1;j<l;j++)
{
if((city[i].compareTo(city[j]))>0)
{
temp=city[j];
city[j]=city[i];
city[i]=temp;
}
}
}
System.out.println("The cities in ascending order are:-");
for(i=0;i<l;i++)
{
System.out.println(city[i]);
}
}
}
/**Chennai
Bangalore 
Kolkata
Mumbai
Hyderabad
Delhi
Ahmedabad
Pune
Coimbatore
Chandigarh*/