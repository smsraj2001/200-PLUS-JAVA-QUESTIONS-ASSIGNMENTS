/**Write a program to calculate the ectricity bill of a customer based on the units consumed as per the given data:-
UNITS CONSUMED:-                                       CHARGES
Upto 100 units                                         Rs.1.00 per unit.
More than 100 units and upto 200 units                 Rs.1.25 per unit.
More than 200 units                                    Rs.1.75 per unit.
In addition to the above,every customer must pay Rs.50, as service charge per month. 
 */

import java.util.*;
public class EXAMPLE_23
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of units for calculations:-");
int units=sc.nextInt();
double charge;
if(units<=100)
charge=100*1+50;
else if(units>100&&units<=200)
charge=100*1+(units-100)*1.25+50;
else
charge=100*1+100*1.25+(units-200)*1.75+50;
System.out.println("The amount to be paid for "+units+" units is "+charge+".");
}
}

    