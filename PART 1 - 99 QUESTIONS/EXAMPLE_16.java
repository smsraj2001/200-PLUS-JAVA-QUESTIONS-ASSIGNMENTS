/**Write a program to compute and display the roots of a quandriatic equation of the form:ax^2+bx+c,if b^2-4ac
results a negative answer , print imaginary roots,if b^2-4ac gives a positive result,print real and distinct
roots.
root1=-b+sqrt(b^2-ac)/2a
root2=-b-sqrt(b^2-ac)/2a
if (b^2-ac)==0,print equal roots,
root=-b/2a*/
 
import java.util.*;
public class EXAMPLE_16
{
 public static void main(String[]args)
 {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a:-");
int a=sc.nextInt();
System.out.println("Enter the value of b:-");
int b=sc.nextInt();
System.out.println("Enter the value of c:-");
int c=sc.nextInt();
int D;
D=(b*b)-(4*a*c);
double root1,root2,root;
if (D<0)
System.out.println("The roots are imaginary.");
else if(D>0)
{
root1=(-b+Math.sqrt(D))/(2*a);
root2=(-b-Math.sqrt(D))/(2*a);
System.out.println("The real and distinct roots are "+root1+" and "+root2+" respectively.");
}      
else
{          
root=(-b)/(2*a);
System.out.println("The roots are equal as b^2-2ac is 0.The root is "+ root+".");        
}
}
}                   