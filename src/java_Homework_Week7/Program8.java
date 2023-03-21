package java_Homework_Week7;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
import java.util.Scanner;
public class Program8 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char ch;
            String cityName;
            System.out.println("Enter any alphabet 'A'TO'F' : ");
            ch = scan.nextLine().charAt(0);
            if (ch == 'A') {
                System.out.println("Ahmedabad");
            } else if (ch == 'B') {
                System.out.println("Bombay");
            } else if (ch == 'C') {
                System.out.println("Channai");
            } else if (ch == 'D') {
                System.out.println("Delhi");
            } else if (ch == 'E') {
                System.out.println("Elora");
            } else if (ch == 'F') {
                System.out.println("Farhanpur");
            } else {
                System.out.print("Invalid Entry");
            }
    }

}

