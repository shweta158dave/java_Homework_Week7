package java_Homework_Week7;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Number");
        int number = scan.nextInt();
        //ternary operator
        String ans = number%2==0 ? " Even Number" : "  Odd Number";
        System.out.println(number + "  is" + ans);



    }
}
