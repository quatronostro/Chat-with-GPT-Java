package Q02_ChatwithGPT;

import java.util.Scanner;

public class P01_stringReverseMethod {
    public static void main(String[] args) {
         /*
        I asked to ChatGPT:
        ask me 10 java questions for practise while loop, for loop,
        string manipulations and method call functions.
        It said quickly:
        Certainly, here are ten Java questions for practice that cover
        while loops, for loops, string manipulations, and method calls:
         */

        // Q1: Write a method that takes in a string and returns the string reversed.
        Scanner scan = new Scanner(System.in);

        System.out.print("This program reverse the text you given, so lets try..." +
                "\nPlease enter a text :  ");
        String text = scan.nextLine();

        System.out.println();
        System.out.println("========== RESULT ==========");

        System.out.println(makeReverse(text));
    }

    public static String makeReverse(String str){

        String reverse = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
