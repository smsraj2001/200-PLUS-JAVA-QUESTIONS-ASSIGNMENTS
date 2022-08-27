/**Write a program to input a string nd print out the text with the uppercaseand lowercase letters
reversed,but al other characters should remain the same as before.
EXAMPLE:-
Input : WelComE To School
Output : wELcOMe tO sCHOOL    */ 

//import java.util.*;
import java.io.*;
public class EXAMPLE_62
{
public static void main(String[]args)throws IOException
{
//Scanner sc=new Scanner(System.in);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a sentence:-");
//String S=sc.next();
String S=br.readLine();
StringBuffer S1=new StringBuffer(S);
Character ch='0';
for(int i=0;i<S.length();++i)
{
ch=S1.charAt(i);
if(Character.isUpperCase(ch))
S1.setCharAt(i,Character.toLowerCase(ch));
else
S1.setCharAt(i,Character.toUpperCase(ch));
}
System.out.println(S1);
}
}   