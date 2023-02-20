package Main_ChatwithGPT;

import java.util.Scanner;

public class P04_ifElse_questions {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        Ask me 10 java if else question for practise
        It said quickly:
        Certainly, here are ten Java if-else questions for practice:
         */

        // Q4: Write an if-else statement that checks if a string is empty or not.

        Scanner scan = new Scanner(System.in);

        System.out.print("This program checks the String you given is palindrome or not" +
                "\nPlease enter some text :  ");
        String text = scan.nextLine();
        String reverse = "";

        System.out.println();
        System.out.println("========== RESULT ==========");

        for (int i = text.length() - 1; i >= 0 ; i--) {
            reverse += text.charAt(i);
        }

        if (text.equals(reverse)) {
            System.out.println("Your text is palindrome :" +
                    "\n" + text +
                    "\n" + reverse);
        } else {
            System.out.println("Your text is not a palindrome");
        }

    }
}
