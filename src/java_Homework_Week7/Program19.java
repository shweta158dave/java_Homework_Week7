package java_Homework_Week7;

/**
 * 19. Write a Java program to calculate the average value of array elements.
 */
public class Program19 {


    public static void main(String[] args) {
        double[] arr = {19, 12.89, 16.5, 200, 13.7,44,55,11,34,23,67,48,29};
        double total = 0;

        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }
// Average is total value  devided by the numbers of elements


        double average = total / arr.length;


        System.out.format("The average is: %.3f", average);
    }


    }



