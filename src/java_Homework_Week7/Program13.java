package java_Homework_Week7;

import java.util.Scanner;
public class Program13 {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int day = in.nextInt();

        System.out.println(getDayName(day));
    }

    // Get the name for the Week
    public static String getDayName(int day) {
        String dayName =   " ";
        switch (day) {
            case 1: dayName = "MONDAY";
            break;
            case 2: dayName = "TUESDAY";
            break;
            case 3: dayName = "WEDNESDAY";
            break;
            case 4: dayName = "THURSDAY";
            break;
            case 5: dayName = "FRIDAY";
            break;
            case 6: dayName = "SATURDAY";
            break;
            case 7: dayName = "SUNDAY";
            break;
            default:dayName = "Invalid day range";
        }

        return dayName;


    }
}
