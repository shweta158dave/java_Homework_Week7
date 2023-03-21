package java_Homework_Week7;

/**
 * 11. Write a java program to print the numbers between1 to 100
 * which can be divided by 3  and 5 separately.
 */

public class Program11 {

    public static void main(String[] args) {
        devider();
//calling a new method in main method
    }
    public static void devider(){
        //new Method is created
        System.out.println("\nDivided by 3: ");
        for (int i=1; i<100; i++)
        {
            if (i%3==0)
                //for loop and if condition is used
                System.out.print(i +", ");
        }

        System.out.println("\n\nDivided by 5: ");
        for (int i=1; i<100; i++)
        {
            if (i%5==0) System.out.print(i +", ");
        }
    }
        }








