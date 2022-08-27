/**Write a program to assign a full path and file name as given below.Using library functions,extract and output
the file path,file name and file extension separately as shown.
INPUT : C:\Users\admin\Pictures\flower.jpg
Last Index : 23
OUTPUT : Complete File path and name : C:\Users\admin\Pictures\flower.jpg
File Path : C:\Users\admin\Pictures\
File name : flower.jpg    */

import java.util.*;
public class EXAMPLE_131
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
String C_N,F_P,F_N;
System.out.println("Enter the full file path with file name and extension:-");
C_N=sc.next();
int last=C_N.lastIndexOf('\\');
System.out.println("Last Index : "+last);
F_P=C_N.substring(0,last+1);
F_N=C_N.substring(last+1);
System.out.println("Complete File path and name : "+C_N);
System.out.println("File Path : "+F_P);
System.out.println("File name.extension : "+F_N);
}
}