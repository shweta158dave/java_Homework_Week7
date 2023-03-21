package java_Homework_Week7;


/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;
import java.util.Collections;


public class Program17 {


    public static void main(String[] args) {
        int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
//sort() method of the Arrays class
        Arrays.sort(array);
        System.out.println("Elements of array sorted in ascending order: ");
//prints array using the for loop
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }

//defining an array of type String
        String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia",
                " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};
//sorts array in descending order
        Arrays.sort(countries, Collections.reverseOrder());
//prints the sorted string array in descending order
        System.out.println(Arrays.toString(countries));
    }

    }




