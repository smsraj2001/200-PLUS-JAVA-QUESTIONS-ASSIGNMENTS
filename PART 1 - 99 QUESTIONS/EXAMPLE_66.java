/**Given below:-
Table showing rates of income tax below 65 years.
 TAXABLE INCOME(TI) IN Rs.                                         INCOME TAX IN Rs
*Does not exceed Rs.160000                                         NIL
*Greater than 160000 and less than or equal to Rs.500000           TI : 160000*10%
*Is greater than Rs.500000 and less than equal to Rs.800000        TI : 500000*20%+34000
*Is greater than Rs.800000                                         TI : 800000*30%+94000      
Write a program to input the age,gender and taxable income of the person.If the age is more than 65 
years or the gender is female , display it as wrong category.If the age is <=65 years and the gender 
is male ,compute the income tax as per the given data...      */
 
import java.io.*;
public class EXAMPLE_66
{
public static void main(String[]args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int age=0;
String gender="";
String name="";
double salary=0.00,TI=0.00;
System.out.println("Enter the name of the person:-");
name=br.readLine();
System.out.println("Enter the gender of "+name+" :-");
gender=br.readLine();
System.out.println("Enter the age of "+name+" :-");
age=Integer.parseInt(br.readLine());
System.out.println("Enter the salary of Mr."+name+" :-");
salary=Double.parseDouble(br.readLine());
if(gender.equalsIgnoreCase("male"))
{
if(age<=65)
{
if(salary<=160000)
TI=0.00+salary;
else if(salary>160000&&salary<=500000)
TI=salary-(salary*0.10);
else if(salary>500000&&salary<=800000)
TI=salary-(salary*0.20)-34000;
else
TI=salary-(salary*0.30)-94000;
System.out.println("The salary received after the tax is "+TI+".");
}
else
System.out.println("Wrong Entry.Enter the age less than 65 years of age.");
}
else
System.out.println("Wrong entry.Enter the gender:MALE.");
}
}    