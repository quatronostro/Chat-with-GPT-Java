package Q02_ChatwithGPT;

import java.util.Scanner;

public class P05_replaceAtoE {
    public static void main(String[] args) {
         /*
        I asked to ChatGPT:
        ask me 10 java questions for practise while loop, for loop,
        string manipulations and method call functions.
        It said quickly:
        Certainly, here are ten Java questions for practice that cover
        while loops, for loops, string manipulations, and method calls:
         */

        // Q5: Write a program that reads in a string and replaces all occurrences of the letter "a" with "e".

        Scanner scan = new Scanner(System.in);
        System.out.print("This program will change all 'a' letters to 'e' in your text, so lets try..." +
                "\nPlease enter some text :  ");
        String text = scan.nextLine();

        System.out.println();
        System.out.println("========== RESULT ==========");
        System.out.println(ReplaceAtoE(text));
    }

    public static String ReplaceAtoE(String text){
        String str = text.toLowerCase();
        str = str.replaceAll("a", "e");
        return str;
    }

}
