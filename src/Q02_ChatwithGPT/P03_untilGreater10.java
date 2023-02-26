package Q02_ChatwithGPT;

import java.util.Scanner;

public class P03_untilGreater10 {
    public static void main(String[] args) {
         /*
        I asked to ChatGPT:
        ask me 10 java questions for practise while loop, for loop,
        string manipulations and method call functions.
        It said quickly:
        Certainly, here are ten Java questions for practice that cover
        while loops, for loops, string manipulations, and method calls:
         */

        // Q3: Write a while loop that prompts the user to enter a number,
        // and keeps prompting them until they enter a number
        // that is greater than 10.

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a positive intiger :  ");
        int enterednum = scan.nextInt();
        boolean correctNum = (enterednum > 10);

        while (!correctNum){
            System.out.println("Try another number : ");
            enterednum = scan.nextInt();
            correctNum = (enterednum > 10);
        }

        System.out.println();
        System.out.println("========== RESULT ==========");
        System.out.println("You won the game!");

    }
}
