/** Write a program to check a number is a pronic number or not.*/

import java.util.*;
public class EXAMPLE_72
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number : ");
int n = sc.nextInt();
int flag = 0;
for(int i=1; i<=n; i++)
{
if(i*(i+1) == n)
{
flag = 1;
break;
}
} 
if(flag == 1)
System.out.println(n+" is a Pronic Number.");
else
System.out.println(n+" is not a Pronic Number.");      
}
}