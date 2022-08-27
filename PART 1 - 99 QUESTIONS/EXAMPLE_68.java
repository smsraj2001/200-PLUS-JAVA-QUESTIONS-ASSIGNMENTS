/**Write a program to read an i ntehger from the keyboard and then print its square and cube.*/

import java.io.*;
public class EXAMPLE_68
{
public static void R_P_I()
{
String inLine=null;
int intVal=0;
try
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a valid integer number:-");
//inLine=br.readLine();
//intVal=Integer.parseInt(inLine);
intVal=Integer.parseInt(br.readLine());
}
catch(NumberFormatException nfe)
{
System.out.println("You did not enter a valid integer number.");
return;
}
catch(Exception e)
{
System.out.println("Exception : "+e);
return;
}
int sq,cube;
sq=intVal*intVal;
cube=sq*intVal;
System.out.println("The square of "+intVal+" is "+sq+".");
System.out.println("The cube of "+intVal+" is "+cube+"."); 
}
public static void main(String[]args)
{
R_P_I();
}
}   