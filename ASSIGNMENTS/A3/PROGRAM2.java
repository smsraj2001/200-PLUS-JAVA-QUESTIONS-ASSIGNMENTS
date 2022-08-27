/**Define a class student described as below:-
Data members/Instance variables:-
name,age,m1,m2,m3(marks in 3 subjects),maximum,average .
Member methods:-
1)A parameterized constructor to initialize the data members.
2)To accept the details of a student.
3)To compute average and maximum out of three marks.
4)To display the name,age,marks in three subjects,maximum and average.
Write main() to create an object of the class and call the above member methods...*/

import java.util.*;
public class PROGRAM2  /**Enter Student*/
{
public static String name;
public static int age,M1,M2,M3,maximum;
public static double average;
public PROGRAM2(String a,int b,int c,int d,int e)
{
a=name;
b=age;
c=M1;
d=M2;
e=M3;
}
public static void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of the student:-");
name=sc.next();
System.out.println("Enter the age of the student:-");
age=sc.nextInt();
System.out.println("Enter the marks in ENGLISH:-");
M1=sc.nextInt();
System.out.println("Enter the marks in MATHEMATICS:-");
M2=sc.nextInt();
System.out.println("Enter the marks in COMPUTER APPLICATIONS:-");
M3=sc.nextInt(); 
}
public static void compute()
{
average=(M1+M2+M3)/3;
int x=Math.max(M1,M2);
maximum=Math.max(x,M3);
}
public static void display()
{
System.out.println("NAME OF THE STUDENT:"+name+".");
System.out.println("AGE : "+age+".");
System.out.println("ENGLISH : "+M1+".");
System.out.println("MATHEMATICS : "+M2+".");
System.out.println("COMPUTER APPLICATIONS : "+M3+".");
System.out.println("HIGHEST MARKS OUT OF THE THREE : "+maximum+".");
System.out.println("AVERAGE OF THE THREE SUBJECTS IS "+average+".");
}
public static void main(String[]args)
{
String a1="";
int b1=0,c1=0,d1=0,e1=0;
PROGRAM2 obj=new PROGRAM2(a1,b1,c1,d1,e1);
accept();
compute();
display();
}
}