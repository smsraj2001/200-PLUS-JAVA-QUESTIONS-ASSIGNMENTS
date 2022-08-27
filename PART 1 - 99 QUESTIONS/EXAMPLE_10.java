/**Write a program to find the ASCII values for different characters.*/

import java.util.*;
public class EXAMPLE_10
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:-");
        char ch=sc.next().charAt(0);
        int x=ch;
        System.out.println("The ASCII value of "+ ch+ " is "+x+".");
    }
}