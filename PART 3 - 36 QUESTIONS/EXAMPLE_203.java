/**Write a program to check whether a number is perfect cube number or not.*/

import java.util.*;
public class EXAMPLE_203
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:-");
int cube=sc.nextInt();
int r=0;
for(int i=1;i<=cube;i++)
{
if((i*i*i)==cube)
{
r=i;
break;
}
else
r=0;
}
if(r==0)
System.out.println(cube+" is not  perfect cube  number.");
else
System.out.println(cube+" is a perfect cube  number.");
}
}
