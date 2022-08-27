/**Write a program that invokes a function satis() to find whether four integers a,b,c and d sent to satis()
satisfy the equation a^3 + b^3 + c^3=d^3 or not.The function satis() returns zero if the above equation is 
satisfied with the given four numbers otherwise it returns -1.     */
 
import java.util.*;
public class PROGRAM6
{
public static int satis(int a,int b,int c,int d)
{
int result1=0;
double E1=(int)Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3);
double E2=(int)Math.pow(d,3);
if(E1==E2)
{
result1=0;
return result1;
}
else
{
result1=-1;
return result1;
}
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a :-");
int a1=sc.nextInt();
System.out.println("Enter the value of b :-");
int b1=sc.nextInt();
System.out.println("Enter the value of c :-");
int c1=sc.nextInt();
System.out.println("Enter the value of d :-");
int d1=sc.nextInt();
PROGRAM6 obj=new PROGRAM6();
int result=obj.satis(a1,b1,c1,d1);
System.out.println("The result is "+result+".");
}
}