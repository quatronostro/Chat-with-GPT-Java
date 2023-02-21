package Q01_ChatwithGPT;

import java.util.Scanner;

public class P07_ifElse_questions {
    public static void main(String[] args) {
         /*
        I asked to ChatGPT:
        Ask me 10 java if else question for practise
        It said quickly:
        Certainly, here are ten Java if-else questions for practice:
         */

        // Q7: Write an if-else statement that checks if a number is a prime number or not.

        Scanner scan = new Scanner(System.in);

        System.out.print("This program checks the number you given is a prime number or not" +
                "\nPlease enter a number :  ");
        int num = scan.nextInt();

        System.out.println();
        System.out.println("========== RESULT ==========");

        boolean flag = false;

        if (num < 2) {
            System.out.println(num + " is not a prime number, prime numbers are start on 2.");
        } else if (num >= 2) {

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
}
