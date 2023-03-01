package Q3_ChatwithGPT;


import java.util.Locale;
import java.util.Scanner;

public class P08_firstLetterCapitalized {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        ask me 5 while loop, 5 do while loop, 10 method overloading, 10 for loop question,
        5 basic array question in Java language,
        and ask this questions in a mix, also these will be different from previous questions
        It said quickly:
        Certainly! Here are some mixed Java questions:
         */

        // Q8: Write a method that takes in a string and returns a new string with the first letter capitalized.
        Scanner scan = new Scanner(System.in);
        System.out.println("This program takes text from you and turns into first letter capitalized version." +
                "\nPlease enter your sentence : ");
        String text = scan.nextLine();

        System.out.println();
        System.out.println("========== RESULT ==========");
        System.out.println(capitalized(text) + text.substring(1));


    }
    public static String capitalized(String text){
        text = String.valueOf(text.toUpperCase().charAt(0));
        return text;
    }

}
