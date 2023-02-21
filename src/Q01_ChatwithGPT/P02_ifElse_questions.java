package Q01_ChatwithGPT;

import java.util.Scanner;

public class P02_ifElse_questions {
    public static void main(String[] args) {

        /*
        I asked to ChatGPT:
        Ask me 10 java if else question for practise
        It said quickly:
        Certainly, here are ten Java if-else questions for practice:
         */

        // Q2: Write an if-else statement that checks if a number is even or odd.

        Scanner scan = new Scanner(System.in);

        System.out.print("This program checks the number you given is even or odd" +
                "\nPlease enter a number :  ");
        double num = scan.nextDouble();

        System.out.println();
        System.out.println("========== RESULT ==========");

        if (num % 2 == 0) {
            System.out.println("The number you given " + num + " is even number.");
        }
        if (num % 2 != 0) {
            System.out.println("The number you given " + num + " is odd number.");
        }
    }
}
