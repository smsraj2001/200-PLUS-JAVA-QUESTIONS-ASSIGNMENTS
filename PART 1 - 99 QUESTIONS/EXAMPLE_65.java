/**Write a program to print alphabetic pyramid  with the help of nested loop.*/

public class EXAMPLE_65
{
public static void main(String[]args)
{
for(char i='A';i<='Z';i++)
{
System.out.println();
for(char j='A';j<=i;j++)
{
System.out.print(i);
}
}
}
}