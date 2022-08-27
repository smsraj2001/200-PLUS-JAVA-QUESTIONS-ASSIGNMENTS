/**Write a program to display the series 1,8,27,64...........upto N terms.*/

import java.util.*;
public class PROGRAM6
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of terms for the cube series:-");
int N=sc.nextInt();
System.out.println("The series is :-");
for(int i=1;i<=N;i++)
{
int cube=(int)Math.pow(i,3);
System.out.print(cube+",");
}
}
}