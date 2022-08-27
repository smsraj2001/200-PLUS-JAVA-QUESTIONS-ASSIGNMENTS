/**Write a program to perform a array program on linear search:-*/

import java.util.*;
public class EXAMPLE_210
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of users:-");
int l=sc.nextInt();
String name[]=new String[l];
int PF[]=new int[l];
for(int i=0;i<l;i++)
{
System.out.println(i+1+") Enter the name:-");
name[i]=sc.next();
System.out.println("Enter the PF number of "+name[i]+":-");
PF[i]=sc.nextInt();
}
System.out.println("Enter the name to display the PF number:-");
String nam=sc.next();
int found=0,PFF=0;
for(int i=0;i<l;i++)
{
if(name[i].equalsIgnoreCase(nam))
{
found=1;
PFF=PF[i];
break;
}
}
if(found==1)
System.out.println("The PF number of "+nam+" is "+PFF+".");
else
System.out.println("Sorry,the name does not exist.");
}
}