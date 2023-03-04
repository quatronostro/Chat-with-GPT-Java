package Q3_ChatwithGPT;

import java.util.Scanner;

public class P16_findingWordwithChar {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        ask me 5 while loop, 5 do while loop, 10 method overloading, 10 for loop question,
        5 basic array question in Java language,
        and ask this questions in a mix, also these will be different from previous questions
        It said quickly:
        Certainly! Here are some mixed Java questions:
         */

        // Q16: Write a method that takes in a string and a character,
        // and returns the index of the first occurrence of the character in the string.

        Scanner scan = new Scanner(System.in);
        System.out.println("This program finds the first index of character in text you gave." +
                "\nPlease enter your sentence : ");
        String sentence = scan.nextLine();
        System.out.println("Please enter a character : ");
        char character = scan.next().charAt(0);

        System.out.println();
        System.out.println("========== RESULT ==========");
        System.out.println("Index of your character is : " + findChar(sentence, character));

    }
    public static int findChar(String text, char ch){

        return text.indexOf(ch);
    }
}
