/** Find GCD of two numbers.*/

import java.util.*;
public class EXAMPLE_81
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the First no : ");
int n1=sc.nextInt();
System.out.print("Enter the Second no : ");
int n2=sc.nextInt();
int r;
while(n2 != 0)
{
 r = n1 % n2;
 n1 = n2; 
 n2 = r;
}
System.out.print("GCD = "+n1);
}
}
