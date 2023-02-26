package Q3_ChatwithGPT;

import Q01_ChatwithGPT.P09_ifElse_passwordControler;

import java.util.Scanner;

public class P02_passwordControllerdoWhile {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        ask me 5 while loop, 5 do while loop, 10 method overloading, 10 for loop question,
        5 basic array question in Java language,
        and ask this questions in a mix, also these will be different from previous questions
        It said quickly:
        Certainly! Here are some mixed Java questions:
         */

        // Q1: Write a do-while loop that prompts the user to enter a password,
        // and keeps prompting them until they enter a valid password
        // (which can be defined based on certain criteria).

        // CRITERIA--
        // 1) Password must contain at least 1 lowercase letter
        // 2) Password must contain at least 1 Uppercase letter
        // 3) Password must contain at least 1 integer
        // 4) Password must be at least 8 characters

        Scanner scan = new Scanner(System.in);
        System.out.println("========== CREATE PASSWORD ==========");
        System.out.println("Password criteria : " +
                "\n1) Password must contain at least 1 lowercase letter. " +
                "\n2) Password must contain at least 1 Uppercase letter. " +
                "\n3) Password must contain at least 1 integer. " +
                "\n4) Password must be at least 8 characters. ");

        String password;
        int flag = 4;
        char ch;
        boolean upper = false;
        boolean lower = false;
        boolean digit = false;


        do {
            System.out.println("Enter your password : ");
            password = scan.nextLine();


            for (int i = 0; i < password.length(); i++) {
                ch = password.charAt(i);
                upper = Character.isUpperCase(ch);
            }
            for (int i = 0; i < password.length(); i++) {
                ch = password.charAt(i);
                lower = Character.isUpperCase(ch);
            }
            for (int i = 0; i < password.length(); i++) {
                ch = password.charAt(i);
                digit = Character.isDigit(ch);
            }


            if (!upper) {
                System.out.println("Your password must contain at least 1 integer!, Please try again.");
                password = scan.nextLine();
            } else {
                flag++;
            }

            if (!lower) {
                System.out.println("Your password must contain at least 1 lowercase letter!, Please try again.");
                password = scan.nextLine();
            } else {
                flag++;
            }

            if (!digit) {
                System.out.println("Your password must contain at least 1 Uppercase letter!, Please try again.");
                password = scan.nextLine();
            } else {
                flag++;
            }

            if (password.length() >= 8) {
                flag++;
            } else {
                System.out.println("Your password must contain at least 1 lowercase letter!, Please try again.");
                password = scan.nextLine();
            }

        } while (flag == 4);


    }
}
