/**Write a program thatreturns the comission of the sales man, based on the following conditions:-
    SALES                                           COMISSION
    Less than 5000                                  5%
    5000 to 10000                                   8%
    Above 10000                                     10%
    Use this information.*/
    
import java.util.*;    
public class EXAMPLE_17
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of the sales amount:-");
int S_A=sc.nextInt();
double com;
if(S_A<5000)
{
com=0.05*S_A;
System.out.println("The comission of the sales man is Rs: "+com+".");
}
else if(S_A>=5000&&S_A<=10000)
{
com=0.08*S_A;
}
else
{
com=0.10*S_A;
System.out.println("The comission of the sales man is Rs: "+com+".");
}
}
}
