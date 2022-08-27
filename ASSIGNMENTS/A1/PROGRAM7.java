/**Write a program to calculate discount.Use scanner class to accept product number,product name,rate,quantity 
and final amount.Calculate total amount and on it take 5% discount.*/

 import java.util.*;
 public class PROGRAM7
 {
     public static void main(String[]args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the name of the product:-");
         String P_name=sc.next();
         System.out.println("Enter the number of the product:-");
         int P_number=sc.nextInt();
         System.out.println("Enter the quantity of the product:-");
         int quantity=sc.nextInt();
         System.out.println("Enter the rate%:-");
         int rate=sc.nextInt();
         int amount;
         double discount,FinalA;
         amount=rate*quantity;
         System.out.println("The amount is "+amount+".");
         discount=0.05*amount;//Rate is 5%.
         System.out.println("The discount is "+discount+".");
         FinalA=amount-discount;
         System.out.println("The final amount is "+FinalA+".");
        }
    }
