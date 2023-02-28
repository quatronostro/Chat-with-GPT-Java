package Q3_ChatwithGPT;

import java.util.Arrays;
import java.util.Scanner;

public class P06_forLoopfoStringtoUppercaseArray {
    public static void main(String[] args) {
         /*
        I asked to ChatGPT:
        ask me 5 while loop, 5 do while loop, 10 method overloading, 10 for loop question,
        5 basic array question in Java language,
        and ask this questions in a mix, also these will be different from previous questions
        It said quickly:
        Certainly! Here are some mixed Java questions:
         */

        // Q6: Write a for loop that iterates over an array of strings and prints each string in all uppercase letters.

        Scanner scan = new Scanner(System.in);
        System.out.println("This program take text from you and turns into an array and prints in all uppercase." +
                "\nPlease enter some text : ");
        String text = scan.nextLine();

        String[] arrText = text.split(" ");

        for (int i = 0; i < arrText.length ; i++) {
                arrText[i] = arrText[i].toUpperCase();
        }

        System.out.println();
        System.out.println("========== RESULT ==========");
        System.out.println(Arrays.toString(arrText));


    }
}
