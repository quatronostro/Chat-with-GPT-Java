package Main_ChatwithGPT;

import java.util.Scanner;

public class P03_ifElse_questions {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        Ask me 10 java if else question for practise
        It said quickly:
        Certainly, here are ten Java if-else questions for practice:
         */

        // Q3: Write an if-else statement that checks if a string is empty or not.

        Scanner scan = new Scanner(System.in);

        System.out.print("This program checks the String you given is empty or not" +
                "\nPlease enter some text :  ");
        String text = scan.nextLine();

        System.out.println();
        System.out.println("========== RESULT ==========");

        if (text.isEmpty()) {
            System.out.println("String is empty.");
        } else {
            System.out.println("String is not empty" +
                    "\nYour text is saved like this: " + text);
        }


    }
}
