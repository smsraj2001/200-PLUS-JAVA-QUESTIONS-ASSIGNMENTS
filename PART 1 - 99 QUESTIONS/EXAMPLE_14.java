/**Write a program thaty inputs number of sides of a polygon and then determines whether it is a hexagon or a
pentagon or a rectangle or a triangle.*/

import java.util.*;
public class EXAMPLE_14
{
 public static void main(String[]args)
 {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter a side:-");
     int n=sc.nextInt();
     if(n==3)
     System.out.println("The given polygon is a triangle.");
     else if(n==4)
     System.out.println("The given polygon is a rectangle.");
     else if(n==5)
     System.out.println("The given polygon is a pentagon.");
     else if(n==6)
     System.out.println("The given polygon is a hexagon.");
     else
     System.out.println("It is a polygon.");
    }
}