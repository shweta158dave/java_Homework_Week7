package java_Homework_Week7;

/**
 * 6. Write a java program to input any number and find out if it’s odd or even
 */
import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = scan.nextInt();


        String evenOrOdd = (num % 2 == 0) ? "even number" : "odd number";

        System.out.println(num + " is an " + evenOrOdd);



    }

}