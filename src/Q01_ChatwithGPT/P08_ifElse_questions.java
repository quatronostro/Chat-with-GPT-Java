package Q01_ChatwithGPT;

import java.util.Scanner;

public class P08_ifElse_questions {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        Ask me 10 java if else question for practise
        It said quickly:
        Certainly, here are ten Java if-else questions for practice:
         */

        // Q8: Write an if-else statement that checks if a given string is a valid email address.
        Scanner scan = new Scanner(System.in);

        System.out.print("This program checks the email address you given is a valid or not" +
                "\nPlease enter an email address :  ");
        String mail = scan.nextLine();

        System.out.println();
        System.out.println("========== RESULT ==========");

        if (mail.isEmpty()) {
            System.out.println("Please enter an email address.");
        } else if (!mail.contains('@')) {
            System.out.println("Email address should include '@', please try again.");
        } else if (mail.endsWith("@hotmail.com") || mail.endsWith("@yahoo.com") ||
        mail.endsWith("@gmail.com") || mail.endsWith("@protonmail.com") || mail.endsWith("live.com")) {
        }
    }
}
