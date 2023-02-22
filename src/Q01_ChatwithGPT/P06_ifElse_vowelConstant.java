package Q01_ChatwithGPT;

import java.util.Scanner;
import java.util.regex.Pattern;

public class P06_ifElse_vowelConstant {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        Ask me 10 java if else question for practise
        It said quickly:
        Certainly, here are ten Java if-else questions for practice:
         */

        // Q6: Write an if-else statement that checks if a given character is a vowel or consonant.
        Scanner scan = new Scanner(System.in);

        System.out.print("This program checks the letter you given is a vowel or consonant" +
                "\nPlease enter a letter :  ");
        String letter = scan.next();

        System.out.println();
        System.out.println("========== RESULT ==========");

        if (Pattern.matches("[aeiou]", letter)) {
            System.out.println(letter + " is a vowel letter.");
        } else if (Pattern.matches("[AEIOU]", letter)){
            System.out.println(letter + " is a vowel letter.");
        } else {
            System.out.println(letter + " is a consonant letter.");
        }
    }
}
