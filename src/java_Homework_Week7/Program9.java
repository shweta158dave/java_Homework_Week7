package java_Homework_Week7;

/**
 * 8.Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 * 9. Same as above program-8 using switch statement.
 */
import java.util.Scanner;
public class Program9 {


    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        char ch ;
        System.out.println("Enter any alphabet starts with 'A'TO'F' : ");
        ch = scan.next().charAt(0);


        switch(ch)
        {
            case 'A':
                System.out.println("Ahmedabad");
                break;
            case 'B':
                System.out.println("Bombay");
                break;
            case 'C':
                System.out.println("Chennai");
                break;
            case 'D':
                System.out.println("Delhi");
                break;
            case 'E':
                System.out.println("Elora");
                break;
            case 'F':
                System.out.println("Farhanpur");
                break;

            default:
                System.out.print("Invalid Entry");

        }

    }
}
