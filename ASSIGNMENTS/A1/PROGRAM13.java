/**Write a program to enter roll,name,and marks obtained in three subjects (out of 100) and calculate total 
marks obtained and percentage.*/
 
import java.util.*;
public class PROGRAM13
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the roll number of the person:-");
int roll=sc.nextInt();
System.out.println("Enter the name of the person:-");
String name=sc.next();
System.out.println("Enter the marks of Mathematics:-");
int M1=sc.nextInt();
System.out.println("Enter the marks of Computer:-");
int M2=sc.nextInt();
System.out.println("Enter the marks of Science:-");
int M3=sc.nextInt();                                                        
int T_MK;
double per;
T_MK=M1+M2+M3;
System.out.println("The marks obtained is "+T_MK+".");
per=T_MK/3;
System.out.println("The percentage is " +per+"%.");   
    }
}

