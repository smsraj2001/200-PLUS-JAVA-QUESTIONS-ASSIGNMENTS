/**Write a program to swap two numbers using Call by Value and Call by Reference.*/

public class EXAMPLE_51
{
public static int a=10;//This is global or instance variable.
public static int b=20;
public static void main(String[]args)
{
System.out.println("The initial values of a and b after Call by Value operation is "+a+","+b+".");
PassbyValue(a,b);
System.out.println("The values of a and b after Call by Value operation is "+a+","+b+".");
EXAMPLE_51 obj=new EXAMPLE_51();
PassbyReference(obj);//Address of the variable.
System.out.println("The values of a and b after Call by Reference operation is "+a+","+b+".");
}
public static void PassbyValue(int a1,int b1)
{
int T=a1;
a1=b1;
b1=T;
}
public static void PassbyReference(EXAMPLE_51 obj1)
{
int T=obj1.a;//Objectname.variablename.
obj1.a=obj1.b;
obj1.b=T;
}
}

    