package java_Homework_Week7;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */
import java.util.Scanner;

public class Program12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = scan.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println(ch + " is A Alphabet.");

        } else if(ch >= '0' && ch <= '9') {

            System.out.println(ch + " is A Number.");

        } else {

            System.out.println(ch + " is A Symbol.");
        }


    }
}
