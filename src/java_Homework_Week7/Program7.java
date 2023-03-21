package java_Homework_Week7;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
import java.util.Scanner;

public class Program7 {
int ID;
int Amount;//sales amount
String Name;
float Basic;

public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int ID;
        System.out.println("Enter Seller's ID: ");
        ID =scan.nextInt();
        String Name;
        System.out.println("Enter Seller's Name ");
        Name =scan.next();
        double sales_amount;
        System.out.println("Enter Sales Amount: ");
        sales_amount =scan.nextDouble();
        System.out.println("Enter BAsic Salary: ");
        float BAsic= scan.nextFloat();

        double sales_commissions;
        if (sales_amount>30000 && sales_amount>=50000)
        {
            System.out.println(" commission is " +  sales_amount * 35 / 100);
        } else if (sales_amount >20000 && sales_amount <= 30000) {
            System.out.println(" commission is " +  sales_amount *20 / 100);
        } else if (sales_amount >= 10000 && sales_amount<= 20000) {
            System.out.println(" commission is " + sales_amount * 10 / 100);
        } else if (sales_amount == 10000) {
            System.out.println(" commission is " + sales_amount *5 / 100);
        } else {
            System.out.println(" commission is " + sales_amount * 2 / 100);
        }
    }


}
















