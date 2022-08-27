/**Write a program to make conversions of different quantities like length,temperature and mass.*/
/**Write in the form of menu driven program.*/

import java.util.*;
public class EXAMPLE_34
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter '1' to convert temperature from celsius to fahrenheit.");
System.out.println("Enter '2' to convert temperature from fahrenheit to celsius.");
System.out.println("Enter '3' to convert various forms of lengths.");
System.out.println("Enter '4' to convert various forms of mass.");
System.out.println("Enter your choice:-  ");
int choice=sc.nextInt();
double m,kg,mm,g,mg,km,F,C;
switch(choice)
{
case 1 :
System.out.println("Enter the temperature in fahrenheit:-");
F=sc.nextDouble();
C=5*(F-32)/9;
System.out.println("The temperature "+F+" in fahrenheit is "+C+" in celsius.");
break;
case 2 :
System.out.println("Enter the temperature in celsius:-");
C=sc.nextDouble();
F=(1.8)*(C+32);
System.out.println("The temperature "+F+" in celsius is "+C+" fahrenheit in .");
break;
case 3 :
System.out.println("Enter 'A' to convert millimetre to metre.");
System.out.println("Enter 'B' to convert kilometre to metre.");
System.out.println("Enter 'C' to convert millimetre to kilometre.");
System.out.println("Enter 'D' to convert metre to kilometre.");
System.out.println("Enter 'E' to convert kilometre to millimetre.");
System.out.println("Enter 'F' to convert metre to millimetre.");
System.out.println("Enter your choice:-");
char ch=sc.next().charAt(0);
switch(ch)
{
case 'A' :
System.out.println("Enter the length in millimetre:-");
mm=sc.nextDouble();
m= mm/1000;
System.out.println("The length "+mm+" in millimetre is "+m+" in metre.");
break;
case 'B' :
System.out.println("Enter the length in kilometre:-");
km=sc.nextDouble();
m=km*1000;
System.out.println("The length "+km+" in kilometre is "+m+" in metre.");
break;
case 'C' :
System.out.println("Enter the length in millimetre:-");
mm=sc.nextDouble();
km= mm/1000000;
System.out.println("The length "+mm+" in millimetre is "+km+" in kilometre.");
break;
case 'D' :
System.out.println("Enter the length in metre:-");
m=sc.nextDouble();
km= m/1000;
System.out.println("The length "+m+" in metre is "+km+" in kilometre.");
break;
case 'E' :
System.out.println("Enter the length in kilometre:-");
km=sc.nextDouble();
mm= km*1000;
System.out.println("The length "+km+" in kilometre is "+mm+" in millimetre.");
break;
case 'F' :
System.out.println("Enter the length in metre:-");
m=sc.nextDouble();
mm= m*1000;
System.out.println("The length "+m+" in metre is "+mm+" in millimetre.");
break;
default:
System.out.println("It is a wrong choice.");
}
break;
case 4 :
System.out.println("Enter 'a' to convert milligram to gram.");
System.out.println("Enter 'b' to convert kilogram to gram.");
System.out.println("Enter 'c' to convert milligram to kilogram.");
System.out.println("Enter 'd' to convert gram to kilogram.");
System.out.println("Enter 'e' to convert kilogram to milligram.");
System.out.println("Enter 'f' to convert gram to milligram.");
System.out.println("Enter your choice:-");
char cho=sc.next().charAt(0);
switch(cho)
{
case 'a' :
System.out.println("Enter the mass in milligram:-");
mg=sc.nextDouble();
g= mg*1000;
System.out.println("The mass "+mg+" in milligram is "+g+" in grams.");
break;
case 'b' :
System.out.println("Enter the mass in kilogram:-");
kg=sc.nextDouble();
g=kg*1000;
System.out.println("The mass "+kg+" in kilogram is "+g+" in grams.");
break;
case 'c' :
System.out.println("Enter the length in milligram:-");
mg=sc.nextDouble();
kg= mg/1000000;
System.out.println("The mass "+mg+" in milligram is "+kg+" in kilogram.");
break;
case 'd' :
System.out.println("Enter the mass in gram:-");
g=sc.nextDouble();
kg= g/1000;
System.out.println("The mass "+g+" in metre is "+kg+" in kilogram.");
break;
case 'e' :
System.out.println("Enter the mass in kilogram:-");
kg=sc.nextDouble();
mg= kg*1000;
System.out.println("The mass "+kg+" in kilogram is "+mg+" in milligram.");
break;
case 'f' :
System.out.println("Enter the mass in gram:-");
g=sc.nextDouble();
mg= g*1000;
System.out.println("The mass "+g+" in gram is "+mg+" in milligram.");
break;
default:
System.out.println("It is a wrong choice.");
}
break;
default:
System.out.println("It is a wrong choice.");
}
}
}