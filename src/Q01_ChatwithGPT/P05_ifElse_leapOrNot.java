package Q01_ChatwithGPT;

import java.util.Scanner;

public class P05_ifElse_leapOrNot {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        Ask me 10 java if else question for practise
        It said quickly:
        Certainly, here are ten Java if-else questions for practice:
         */

        // Q5: Write an if-else statement that checks if a given year is a leap year or not.

        Scanner scan = new Scanner(System.in);

        System.out.print("This program checks the year you given is leap year or not" +
                "\nPlease enter a year (with numbers) :  ");
        int year = scan.nextInt();

        System.out.println();
        System.out.println("========== RESULT ==========");

        if (year % 100 == 0 && year % 400 == 0 || year % 100 != 0 && year % 4 == 0 ) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
