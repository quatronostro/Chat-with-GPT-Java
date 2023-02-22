package Q01_ChatwithGPT;

import java.util.Scanner;

public class P08_ifElse_emailControler {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        Ask me 10 java if else question for practise
        It said quickly:
        Certainly, here are ten Java if-else questions for practice:
         */

        // Q8: Write an if-else statement that checks if a given string is a valid email address.
        Scanner scan = new Scanner(System.in);
        String mail = "";
        //System.out.println();
        //System.out.println("========== RESULT ==========");

        boolean flag = false;

        while (!flag) {
            System.out.print("This program checks the email address you given is a valid or not" +
                    "\nPlease enter an email address :  ");
            mail = scan.nextLine();

            if (mail.isEmpty()) {
                System.out.println();
                System.out.println("========== RESULT ==========");
                System.out.println("Please try again:");
            } else if (mail.contains(" ")) {
                System.out.println();
                System.out.println("========== RESULT ==========");
                System.out.println(mail + " is not a valid email address, please try again:");
            } else if (!mail.endsWith("@hotmail.com") && !mail.endsWith("@yahoo.com") &&
                !mail.endsWith("@gmail.com") && !mail.endsWith("@protonmail.com") && !mail.endsWith("@live.com")) {
                System.out.println();
                System.out.println("========== RESULT ==========");
                System.out.println(mail + " is not a valid email address, please try again:");
            } else {
                System.out.println();
                System.out.println("========== RESULT ==========");
                System.out.println(mail + " is a valid email address.");
                flag = true;
            }
        }
    }
}
