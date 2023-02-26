package Q3_ChatwithGPT;

import java.util.Scanner;

public class P01_numberguessing1_10 {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        ask me 5 while loop, 5 do while loop, 10 method overloading, 10 for loop question,
        5 basic array question in Java language,
        and ask this questions in a mix, also these will be different from previous questions
        It said quickly:
        Certainly! Here are some mixed Java questions:
         */

        // Q1: Write a while loop that prompts the user to enter a number,
        // and keeps prompting them until they enter a number that is between 1 and 10.

        Scanner scan = new Scanner(System.in);
        System.out.println("Number guessing game! " +
                "\nLets guess the correct number : ");
        int number = scan.nextInt();
        boolean correctNum = (number >= 1 && number <= 10);

        while (!correctNum){
            System.out.println("Try another number : ");
            number = scan.nextInt();
            correctNum = (number >= 1 && number <= 10);
        }

        System.out.println();
        System.out.println("========== RESULT ==========");
        System.out.println("You won the game! We were looking for a number between 1 and 10.");
    }
}
