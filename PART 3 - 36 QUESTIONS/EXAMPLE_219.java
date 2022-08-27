/**Loop programs:-*/

import java.util.*;
public class EXAMPLE_219
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number for the loop:-");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(i);
}
System.out.println();
}
System.out.println();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(j);
}
System.out.println();
}
System.out.println();
for(int i=n;i>=1;i--)
{
for(int j=1;j<=i;j++)
{
System.out.print(i);
}
System.out.println();
}
System.out.println();
for(int i=1;i<=n;i++)
{
for(int j=n;j>=i;j--)
{
System.out.print(j);
}
System.out.println();
}
System.out.println();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n;j++)
{
System.out.print(i);
}
System.out.println();
}
System.out.println();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n;j++)
{
System.out.print(j);
}
System.out.println();
}
System.out.println();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(i);
}
System.out.println();
}
System.out.println();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(j);
}
System.out.println();
}
System.out.println();
for(int i=1;i<=100;i++)
{
int count=0;
for(int j=1;j<=i;j++)
{
if(i%j==0)
count++;
}
if(count==2)
System.out.println(i);
}
System.out.println("Enter a string:-");
String S=sc.next().toUpperCase(),p="";
for(int i=0;i<S.length();i++)
{
for(int j=i;j<S.length();j++)
p=p+S.charAt(j);
System.out.print(p+S.substring(0,i));
System.out.println();
p="";
}
}
}
/**
 * Enter the number for the loop:-
5
1
22
333
4444
55555

1
12
123
1234
12345

55555
4444
333
22
1

54321
5432
543
54
5

11111
2222
333
44
5

12345
2345
345
45
5

11111
22222
33333
44444
55555

12345
12345
12345
12345
12345

2
3
5
7
11
13
17
19
23
29
31
37
41
43
47
53
59
61
67
71
73
79
83
89
97
Enter a string:-
BLuej
BLUEJ
LUEJB
UEJBL
EJBLU
JBLUE
*/