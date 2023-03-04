package Q3_ChatwithGPT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class P18_onlyVowels {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        ask me 5 while loop, 5 do while loop, 10 method overloading, 10 for loop question,
        5 basic array question in Java language,
        and ask this questions in a mix, also these will be different from previous questions
        It said quickly:
        Certainly! Here are some mixed Java questions:
         */

        // Q18: Write a for loop that iterates over an array of characters and prints out only the vowels.
        Scanner scan = new Scanner(System.in);
        System.out.println("This program finds vowel letters in your sentence" +
                "\nLet's try, give program a sentence : ");
        String sentence = scan.nextLine();

        String[] sentenceArr = sentence.split("");
        StringBuilder vowels = new StringBuilder();

        for (String s : sentenceArr) {
            if (Pattern.matches("[aeiouAEIOU]", s)) {
                 vowels.append(s).append(", ");
            }
        }

        System.out.println();
        System.out.println("========== RESULT ==========");
        System.out.println("Vowel letters on your sentence : " + vowels);

    }
}
