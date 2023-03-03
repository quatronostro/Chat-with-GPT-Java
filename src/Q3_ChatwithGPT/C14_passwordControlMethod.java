package Q3_ChatwithGPT;

import java.util.Scanner;

public class C14_passwordControlMethod {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        Ask me 10 java if else question for practise
        It said quickly:
        Certainly, here are ten Java if-else questions for practice:
         */

        // Q14: Write a method that takes in a string and returns true if it is a valid email address,
        // and false otherwise.

        Scanner scan = new Scanner(System.in);
        System.out.println("This program controls your email address is valid or not." +
                "\nPlease enter your mail address : ");
        String mail = "";

        emailController(mail);

        // It doesn't work well, control again later!!!!

    }
    public static void emailController(String str){
        Scanner scan = new Scanner(System.in);
        boolean flag = false;

        while (!flag) {
            str = scan.next();

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
