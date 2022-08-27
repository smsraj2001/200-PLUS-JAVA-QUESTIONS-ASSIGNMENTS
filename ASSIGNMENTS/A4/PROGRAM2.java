/**Write a program to display all the characters from capital A to Z that has even ASCII values:-*/

public class PROGRAM2
{
public static void main(String[]args)
{
System.out.println("The characters of alphabets with even ASCII values are:-");
int x=0;
for(char i='A';i<='Z';i++)
{
x=i;
if(x%2==0)
System.out.println(i+" with the ASCII value "+x+".");
}
}
}