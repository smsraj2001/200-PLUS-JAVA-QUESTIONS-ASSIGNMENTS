/**Write a program to display all the uppercase vowel characters from A to Z.*/

public class PROGRAM12
{
public static void main(String[]args)
{
System.out.println("The vowels are:-");
for(char i='A';i<='Z';i++)
{
if(i=='A'||i=='E'||i=='I'||i=='O'||i=='U')
System.out.println("The vowel is "+i+".");
}
}
}
