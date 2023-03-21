package java_Homework_Week7;

/**
 * Write a Java program to sum values of an array.
 */

public class Program18 {

    public static void main(String[] args) {
        int my_array[] = {111,222,333,444,555,666};
        int sum = 0;

        for (int i : my_array)
            sum += i;
        System.out.println("The sum value of an array is "  +  sum);
    }

    }

