/**Write a program to accept a student's name,his marks in three subjects and print his result sheet in the
following format.
Name:
Maths marks:
English marks:
Computer marks:
Total marks:
Percentage:
Grade:
Assign grade to the student based on the following grade scale:-
Percent<50 is D.
Percent>=50,but less than 60 is C.
Percent>=60,but less than 80 is B.
Percent>=80 is A.
Take input from the user.*/

import java.util.*;
public class EXAMPLE_7
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of the person:-");
String name=sc.next();
System.out.println("Enter the Maths marks of "+name+":-");
int M1=sc.nextInt();
System.out.println("Enter the English marks of "+name+":-");
int M2=sc.nextInt();
System.out.println("Enter the Computer marks of "+name+":-");
int M3=sc.nextInt();
int total_marks;
double P;
total_marks=M1+M2+M3;
System.out.println("The total marks are "+total_marks+".");
P=total_marks/3;
System.out.println("The percentage is "+P+".");
System.out.println("\t\t\t\t\tTHE REPORT CARD:-");
System.out.println("Name: "+name+".");
System.out.println("Maths marks: "+M1+".");
System.out.println("English marks: "+M2+".");
System.out.println("Computer marks: "+M3+".");
System.out.println("Total marks: "+total_marks+".");
System.out.println("Percentage: "+P+".");
if(P<50)
System.out.println("Grade:D.");
else if(P>=50&&P<60)
System.out.println("Grade:C.");
else if(P>=60&&P<80)
System.out.println("Grade:B.");
else
System.out.println("Grade:A.");
}
}   

 