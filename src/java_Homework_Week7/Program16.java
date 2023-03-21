package java_Homework_Week7;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;
public class Program16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");

        int n = in.nextInt();

        if (n > 0)
        {
            System.out.println("Number is positive");
            return;
        }
        else if (n < 0)
        {
            System.out.println("Number is negative");
            return;
        }
        else
        {
            System.out.println("Number is zero");
            return;
        }
    }
    }

