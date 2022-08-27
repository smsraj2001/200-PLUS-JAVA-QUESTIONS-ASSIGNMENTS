/**Write a program to print all factors of a number accepted from user.*/

import java.util.*;
public class EXAMPLE_74
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number ");
int n=sc.nextInt();
int i;
System.out.println("All the factors of number "+n+ " are ");  
for(i=1;i<=n;i++)
{
if(n%i==0)
System.out.print(i+"  ");  
}
}  
}