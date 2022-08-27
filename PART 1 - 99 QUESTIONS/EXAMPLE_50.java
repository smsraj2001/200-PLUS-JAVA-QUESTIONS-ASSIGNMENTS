/**Write a program to print the ASCII code of following characters :
1)? 2)Z 3)m 4)# 5). 6),.In the method ASC().*/

public class EXAMPLE_50
{
public static void ASC()
{
char ch1,ch2,ch3,ch4,ch5,ch6;
int a,b,c,d,e,f;
ch1='?';
a=ch1;
ch2='Z';
b=ch2;
ch3='m';
c=ch3;
ch4='#';
d=ch4;
ch5='.';
e=ch5;
ch6=',';
f=ch6;
System.out.println("The character is "+ch1+" and the its ASCII value is "+a+"."); 
System.out.println("The character is "+ch2+" and the its ASCII value is "+b+"."); 
System.out.println("The character is "+ch3+" and the its ASCII value is "+c+"."); 
System.out.println("The character is "+ch4+" and the its ASCII value is "+d+"."); 
System.out.println("The character is "+ch5+" and the its ASCII value is "+e+"."); 
System.out.println("The character is "+ch6+" and the its ASCII value is "+f+".");
}
public static void main(String[]args)
{
EXAMPLE_50 obj=new EXAMPLE_50();
obj.ASC();
}
} 