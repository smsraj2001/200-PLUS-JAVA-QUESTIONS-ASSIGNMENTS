/**A library charges fine for books returned late as given below:-
NUMBER OF DAYS LATE                                FINE AMOUNT/PER DAY
First five days                                    Rs 1
Six to ten days                                    Rs 2
Above ten days                                     Rs 5
Design a program to calculate the fine assuming that a book is returned n days late.*/ 

import java.util.*;
public class PROGRAM7
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of days to find the fine amount to be paid:-");
int n=sc.nextInt();
double fine;
if(n<=5)
fine=n*1;
else if(n>=6&&n<=10)
fine=(5*1)+(n-5)*2;
else
fine=(5*1)+(5*2)+(n-10)*5;
System.out.println("For "+n+" days due the fine will be Rs "+fine+".");
}
}    