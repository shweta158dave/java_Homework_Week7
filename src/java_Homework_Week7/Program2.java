package java_Homework_Week7;

/**
 * Write a java program to input any year like (ex.2007)
 * and find out if it is leap year or  not?
 */
import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class Program2 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input the year ");
        int year = scan.nextInt();

        boolean a = (year % 4) == 0;
        boolean b = (year % 100) != 0;
        boolean c = ((year % 100 == 0) && (year % 400 == 0));

        if (a && (b || c))
        {
            System.out.println(year + "     is a Leap year");
        }
        else
        {
            System.out.println(year + "     is not a Leap year");
        }


    }
    }












