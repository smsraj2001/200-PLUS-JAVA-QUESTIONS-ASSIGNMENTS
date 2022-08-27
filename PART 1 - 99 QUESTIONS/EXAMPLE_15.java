/**Write a program that reads the height (in cm) and weight (in kg) of a candidate and determines whether
candidate can be considered for a post. A candidate is eligible if he is atleast 175cm tall and weighs between
50kg to 80kg.*/
 
import java.util.*;
public class EXAMPLE_15
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the candidate:-");
        String name=sc.next();
        System.out.println("Enter the height of "+name+":-");
        int height=sc.nextInt();
        System.out.println("Enter the weight of "+name+":-");
        int weight=sc.nextInt();
        if(height>=175&&(weight>=50&&weight<=80))
        System.out.println(name+" is eligible for the post.");
        else
        System.out.println(name+" is not eligible for the post.");
    }
}