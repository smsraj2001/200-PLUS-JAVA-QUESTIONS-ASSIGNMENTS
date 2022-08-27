import java.util.*;

public class EXAMPLE_229
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence:-");
String S=sc.nextLine();
System.out.println("Enter for how many times it should be repeated:-");
int n=sc.nextInt();
System.out.println("The output is:-");
for(int i=0;i<n;i++)
System.out.println(S);
}
}
    