/**Write a program to push an item into the stack.*/

import java.util.*;
public class EXAMPLE_228
{
public static int top=-1,i,Max_Size=100,a[]=new int[Max_Size];
public static void push(int ele)
{
if(top==Max_Size-1)
{
System.out.println("Stack is full.");
return;
}
top++;
a[top]=ele;
System.out.println(ele+" is pushed.");
}
public static void print()
{
if(top!=-1)
{
System.out.println("Stack contains:-");
for(i=0;i<=top;i++)
System.out.print(a[i]+"\t");
System.out.println();
}
else
System.out.println("Stack is empty.");
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
EXAMPLE_228 obj=new EXAMPLE_228();
char ans;
int ele;
System.out.println("Initial status is:-");
obj.print();
System.out.println("Do you want to push an item (Y/N)?");
ans=sc.next().charAt(0);
while(Character.toUpperCase(ans)=='Y')
{
System.out.println("Enter an item:-");
ele=sc.nextInt();
obj.push(ele);
obj.print();
System.out.println("Do you want to push an item (Y/N)?");
ans=sc.next().charAt(0);
}
}
}

