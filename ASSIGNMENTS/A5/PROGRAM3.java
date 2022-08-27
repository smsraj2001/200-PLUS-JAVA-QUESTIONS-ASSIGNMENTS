/**Write functions in the program for the class Student,whose fields are declared below:-
public class Student
{
private String name;//The student's full name.
private String ID;//Student's ID.
private int marks;//The marks taken for the test.
}
PART A:-
Write a constructor to set fields,with given name and ID-number.Set marks to zero.Add
conditional  statements to the next constructor which is default,so that an error message is printed
if either the length of the name parameter is less than 4 characters ,or length of ID parameters less
than 3 characters.However the constructors should still use those parameters,to set the name and ID
fields.

PART B:-
Function to return the first 10 characters of the name of the student.*/

import java.util.*;
public class PROGRAM3
{
private String name;//The student's full name.
private String ID;//Student's ID.
private int marks;//The marks taken for the test.
public PROGRAM3()//Write Student
{
Scanner sc=new Scanner(System.in);
name=" ";
ID=" ";
marks=0;
System.out.println("Enter the name of the student:-");
name=sc.next();
System.out.println("Enter the ID of "+name+":-");
ID=sc.next();
System.out.println("Enter the total marks of the student after the addition of all the subject's marks:-");
marks=sc.nextInt();
System.out.println("Enter the number of subjects:-");
int n=sc.nextInt();
double A=(double)marks/n;
int L1,L2;
L1=name.length();
System.out.println("The length of the name is "+L1+" characters.");
if(L1<4)
System.out.println("Enter a valid name more than 4 characters.");
else
System.out.println("The name is proper.");
L2=ID.length();
System.out.println("The length of the ID is "+L2+" characters.");
if(L2<3)
System.out.println("Enter a valid ID more than 3 characters.");
else
System.out.println("The ID is proper.");
System.out.println("\t\tSTUDENT'S DATA:-");
System.out.println("STUDENT'S NAME : "+name+".");
System.out.println("STUDENT'S ID : "+ID+".");
System.out.println("TOTAL MARKS OF "+name+" : "+marks+".");
System.out.println("AVERAGE : "+A+".");
}
public void First_10()
{
int len=name.length();
String F10;
if(len>=10)
{
F10=name.substring(0,10);
System.out.println("The first 10 characters of "+name+" are "+F10+".");
}
else
System.out.println("Enter a name more than 10 characters.");
}
public static void main(String[]args)
{
PROGRAM3 obj=new PROGRAM3();
obj.First_10();
}
}