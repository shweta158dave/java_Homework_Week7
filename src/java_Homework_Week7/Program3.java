package java_Homework_Week7;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */
import java.util.Scanner;

public class Program3 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Name;
        int RollNumber;
        int Maths;
        int Science;
        int English;
        int Total=0;
        float Percentage;
        boolean Result;
        char Grade;
        System.out.println(" -----------------------------------");
        System.out.println("|                                   |");
        System.out.println("| Mark Sheet                        |");
        System.out.println("|___________________________________|");
        System.out.println("|Enter your Name:                   |");
        String name = scan.next();
        System.out.println("|Enter your Roll No:                |");
        RollNumber = scan.nextInt();
        System.out.println("|___________________________________|");
        System.out.println("| Subjects : Mark                   |");
        System.out.println("|___________________________________|");
        System.out.println("|Enter mark of Math :               |");
        Maths = scan.nextInt();
        System.out.println("|Enter mark of Science :            |");
        Science=scan.nextInt();
        System.out.println("|Enter mark of  English :           |");
        English=scan.nextInt();
        System.out.println("|___________________________________|");
        System.out.println("|Enter your Total :                 |");
        Total=Maths+Science+English;
        System.out.println(Total);
        System.out.println("|___________________________________|");
        System.out.println("| Percentage :                      |");
        Percentage=Total/3;
        System.out.println(Percentage);
        System.out.println("| Result :                          |");
        if(Percentage>=35) {
            System.out.println("Pass");
        }
        else if(Percentage < 45)
        {
            System.out.println("Fail");
        }
        else
        {
            System.out.println("");
        }
        System.out.println("| Grade :                           |");
        if(Percentage>=80){
            System.out.println(" A+ ");
        }
        else if(Percentage>=60)
        {
            System.out.println(" A ");
        }
        else if(Percentage>=50)
        {
            System.out.println(" B ");
        }
        else if (Percentage>=35)
        {
            System.out.println(" C ");
        }
        else
        {
            System.out.println("");
        }
        System.out.println("|___________________________________|");
    }


}













