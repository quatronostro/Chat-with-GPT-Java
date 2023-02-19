package Main_ChatwithGPT;

import java.util.Scanner;
import java.util.regex.Pattern;

public class P01_IfElse_questions {

    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        Ask me 10 java if else question for practise
        It said quickly:
        Certainly, here are ten Java if-else questions for practice:
         */

        // Q1: Write an if-else statement that checks if a number is positive or negative.

        Scanner scan = new Scanner(System.in);

        System.out.print("This program checks the number you given is positive or negative" +
                "\nPlease enter a number :  ");
        String num = scan.next();
        String number;

        System.out.println();
        System.out.println("========== RESULT ==========");
        if (Pattern.matches("[a-zA-Z]+", num)){
                System.out.println("You've entered letters. Please try again.");
        } else if (!Pattern.matches("[a-zA-Z]", num)){
            number = num;
            if (num.contains(".")) {
                if (Double.parseDouble(num) > 0) {
                    System.out.println(num + " is a pozitive number.");
                } else if (Double.parseDouble(num) < 0) {
                    System.out.println(num + " is a negative number.");
                } else {
                    System.out.println(" is neutral number");
                }
            } else if (!num.contains(".")) {
                if (Integer.parseInt(num) > 0) {
                    System.out.println(num + " is a pozitive number.");
                } else if (Integer.parseInt(num) < 0) {
                    System.out.println(num + " is a negative number.");
                } else {
                    System.out.println(num + " is neutral number");
                }
            } else {
                System.out.println("You have entered invalid value, please try again.");
            }
        }



    }
}
