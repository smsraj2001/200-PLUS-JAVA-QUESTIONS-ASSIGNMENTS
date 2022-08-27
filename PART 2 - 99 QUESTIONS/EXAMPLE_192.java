/**Write a program to replace a string:-*/

public class EXAMPLE_192
{
public static void main(String[]args)
{
String S="REPUBLIC DAY IS CELEBRATED IN INDIA ON 26th JANUARY SINCE 1950.";
System.out.println(S);
String T=S.replace("REPUBLIC DAY","INDEPENDENCE DAY");
String U=T.replace("26th JANUARY","15th AUGUST");
String V=U.replace("1950","1947");
System.out.println(V);
int a=7,b=10;
a=a%a++ - --b + ++a/b;
System.out.println(a);
System.out.println(b);
System.out.println(Math.rint(14.5));
}
}