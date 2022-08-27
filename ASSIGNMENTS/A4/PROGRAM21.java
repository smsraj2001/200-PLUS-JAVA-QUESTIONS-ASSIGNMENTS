/**Write a program to find and display the area of the circle with radius ranging from 1 to 10.*/

public class PROGRAM21
{
public static void main(String[]args)
{
System.out.println("The radius of the circle ranging from 1 to 10 for area are:-");
for(int r=1;r<=10;r++)
{
double area=Math.PI*r*r;//Math.PI is equal to 22/7.
System.out.println("The area of the circle with radius "+r+" is "+area+".");
}
}
}