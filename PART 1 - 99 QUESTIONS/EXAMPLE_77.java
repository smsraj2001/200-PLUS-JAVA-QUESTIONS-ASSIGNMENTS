/**Write a  program to check a number is a pronic number or not.*/

import java.util.*;
public class EXAMPLE_77
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number : ");
int n = sc.nextInt();
int c = 0;
for(int i=1; i<=n; i++)
{
if(i*(i+1) == n)
{
c++;
} 
}
if(c == 1)
System.out.println(n+" is a Pronic Number.");
else
System.out.println(n+" is not a Pronic Number.");      
}
}