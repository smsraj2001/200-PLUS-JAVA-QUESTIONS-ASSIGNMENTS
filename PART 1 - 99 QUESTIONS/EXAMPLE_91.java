/**Write a program to input a string and convert it to uppercase.Also count the frequency of each &
every character in the string.
INPUT : Computer Hardware
OUTPUT:-
COMPUTER HARDWARE
A		2
C		1
D		1
E		2
H		1
M		1
O		1
P		1
R		3
T		1
U		1
W		1                             */


import java.util.*;
public class EXAMPLE_91
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:-");
String S=sc.nextLine();
S=S.toUpperCase();
System.out.println(S);
int l=S.length();
String S1="";
int count=0;
for(char i='A';i<='Z';i++)
{
count=0;
for(int j=0;j<l;j++)
{
char ch=S.charAt(j);
if(ch==i)
count++;
}
if(count!=0)
System.out.println(i+"\t\t"+count);
}
}
}

