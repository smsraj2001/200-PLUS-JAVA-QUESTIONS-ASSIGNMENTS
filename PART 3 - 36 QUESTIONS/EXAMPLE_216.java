/**Write a program based on binary search.*/

import java.util.*;
public class EXAMPLE_216
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the search element:-");
double n=sc.nextDouble();
double a[]={44.5,42.5,40.5,35.5,33.5,30.5,25.5,20.5,10.5,5.5};
int U=0,L=0,M=0,found=0,pos=0;
L=0;
U=a.length-1;
while(L<=U)
{
M=(L+U)/2;
if(n>a[M])
L=M+1;
else if(n<a[M])
U=M-1;
else
{
found=1;
pos=M+1;
break;
}
}
if(found==1)
System.out.println(n+" is found in the position "+pos+".");
else
System.out.println("Search element not found.");
}
}