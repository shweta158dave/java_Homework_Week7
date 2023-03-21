package java_Homework_Week7;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
import java.util.Scanner;

public class Program10 {

    public static void main(String[] args) {

        Program10 n = new Program10();
            n.symbol();
            n.method();
        }
        public void symbol()
        {
            System.out.println("select operator:+,-,*,/");
            System.out.println("Enter any operator: ");
        }
        public void method() {
            Scanner scan = new Scanner(System.in);
            int a, b, res;
            char ch;
            ch = scan.next().charAt(0);
            System.out.println("Enter value of a: ");
            a = scan.nextInt();
            System.out.println("Enter value of b: ");
            b = scan.nextInt();
            if (ch == '+') {

                System.out.println(a + b);
            } else if (ch == '-') {

                System.out.println(a - b);
            } else if (ch == '*') {

                System.out.println(a * b);
            } else if (ch == '/') {

                System.out.println(a / b);
            } else {
                System.out.println("  ");
            }

        }

}
