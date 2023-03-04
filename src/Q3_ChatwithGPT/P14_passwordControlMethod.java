package Q3_ChatwithGPT;

import java.util.Scanner;

public class P14_passwordControlMethod {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        ask me 5 while loop, 5 do while loop, 10 method overloading, 10 for loop question,
        5 basic array question in Java language,
        and ask this questions in a mix, also these will be different from previous questions
        It said quickly:
        Certainly! Here are some mixed Java questions:
         */

        // Q14: Write a method that takes in a string and returns true if it is a valid email address,
        // and false otherwise.

        Scanner scan = new Scanner(System.in);
        System.out.println("This program controls your email address is valid or not." +
                "\nPlease enter your mail address : ");

        emailController();

    }
    public static void emailController(){
        Scanner scan = new Scanner(System.in);
        boolean flag = false;

        while (!flag) {
            String str = scan.nextLine();

            if (str.isEmpty()) {
                System.out.println();
                System.out.println("========== RESULT ==========");
                System.out.println("You've entered nothing. Please try again:");
            } else if (str.contains(" ")) {
                System.out.println();
                System.out.println("========== RESULT ==========");
                System.out.println(str + " is not a valid email address, please try again:");
            } else if (!str.endsWith("@hotmail.com") && !str.endsWith("@yahoo.com") &&
                    !str.endsWith("@gmail.com") && !str.endsWith("@protonmail.com") && !str.endsWith("@live.com")) {
                System.out.println();
                System.out.println("========== RESULT ==========");
                System.out.println(str + " is not a valid email address, please try again:");
            } else {
                System.out.println();
                System.out.println("========== RESULT ==========");
                System.out.println(str + " is a valid email address.");
                flag = true;
            }
        }

    }
}
