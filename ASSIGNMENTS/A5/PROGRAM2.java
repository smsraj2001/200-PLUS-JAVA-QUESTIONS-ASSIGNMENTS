/**Write  program to print the following pattern:-
9 7
9 7 5
9 7 5 3
9 7 5 3 1  */

public class PROGRAM2
{
public static void main(String[]args)
{
int k=9;
for(int i=2;i<=5;i++)
{
k=9;
for(int j=1;j<=i;j++)
{
System.out.print(k+" ");
k=k-2;
}
System.out.println();
}
}
}
