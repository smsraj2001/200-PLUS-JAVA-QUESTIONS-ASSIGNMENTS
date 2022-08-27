/**Write a program to arrange a string in ascending order
INPUT : welcome
OUTPUT : ceelmow                  */

import java.util.*;
public class PROGRAM10
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:-");
String S=sc.next().toLowerCase();//For correct ascending order.
int l=S.length(),i,j;
char ch[]=S.toCharArray(),temp;
for(i=0;i<l;i++)
{
for(j=i+1;j<l;j++)
{
if(ch[i]>ch[j])
{
temp=ch[j];
ch[j]=ch[i];
ch[i]=temp;
}
}
}
System.out.println("The characters of the string in ascending order is:-");
for(i=0;i<l;i++)
{
System.out.print(ch[i]);
}
}
}