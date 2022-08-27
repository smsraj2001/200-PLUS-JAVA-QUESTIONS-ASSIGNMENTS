/**Write a program to read marks of 5 subjects of a student and store them under an array namely 
marks.Calculate the total and average marks of the student.*/

import java.util.*;
public class EXAMPLE_89
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int marks [] =new int[5];
System.out.println("Enter the marks in 5 subjects:-");
for(int i=0;i<marks.length;i++)
{
marks[i]=sc.nextInt();
}
int total=0,i;
double A=0;
for(i=0;i<marks.length;i++)
{
total=total+marks[i];
}
A=(double)total/5;
System.out.println("Marks in 5 subjects are:-");
for(i=0;i<5;i++)
{
System.out.print(marks[i]+" , ");
}
System.out.println();
System.out.println("Total marks are "+total+".");
System.out.println("Average marks are "+A+".");
}
}
/**to print the even numbers in the array.
import java.util.*;
public class ArrEven
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int A[]=new int[10];
        System.out.println("Enter 10 numbers.");
        for(int i=0;i<A.length;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Even numbers are :");
        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2==0)
            System.out.println(A[i]);
        }
    }
}               */


