/**Write a program to display the sum of negative odd numbers from -1 to -10.*/

public class PROGRAM22
{
public static void main(String[]args)
{
int sum=0;
for(int i=-1;i>=-10;i--)
{
if(i%2!=0)
{
System.out.println("The number is "+i+".");
sum=sum+i;
}
}
System.out.println("The sum of these numbers are "+sum+".");
}
}
