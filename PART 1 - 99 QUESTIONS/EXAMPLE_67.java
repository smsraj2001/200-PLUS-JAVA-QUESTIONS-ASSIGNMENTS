/**Write a program ,which recieves a text string and a search string and counts all occurances of the
search string in the given text string.*/
 
import java.util.*;
public class EXAMPLE_67
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the source string:-");
String SO=sc.nextLine();
System.out.println("Enter the string to be searched from source string:-");
String SE=sc.next();
int count=0,sp=0;
String W="";
for(int i=0;i<SO.length();i++)
{
char ch=SO.charAt(i);
if(ch==' ')
{
W=SO.substring(sp,i);
sp=i+1;
}
if(SE.equals(W))
{
count=count+1;
}
}
System.out.println("The string "+SE+" occurs "+count+" times in "+SO);
}
}
    