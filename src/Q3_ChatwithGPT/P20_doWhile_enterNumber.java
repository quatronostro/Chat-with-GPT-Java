package Q3_ChatwithGPT;

import java.util.Scanner;

public class P20_doWhile_enterNumber {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        ask me 5 while loop, 5 do while loop, 10 method overloading, 10 for loop question,
        5 basic array question in Java language,
        and ask this questions in a mix, also these will be different from previous questions
        It said quickly:
        Certainly! Here are some mixed Java questions:
         */

        // Q20: Write a do-while loop that prompts the user to enter a number,
        // and keeps prompting them until they enter a number that is greater than 100.

        Scanner scan = new Scanner(System.in);

        int enteredNumber;
        boolean flag;

        do {
            System.out.println("Enter a number : ");
            enteredNumber = scan.nextInt();

            if (enteredNumber <= 100){
                flag = false;
            } else {
                System.out.println("Congrats, you win! :)");
                flag = true;
            }

        } while (!flag);
    }
}
