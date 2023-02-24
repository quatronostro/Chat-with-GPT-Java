package Q02_ChatwithGPT;

import java.util.Scanner;
import java.util.regex.Pattern;

public class P04_numberOfvowels_String {
    public static void main(String[] args) {

         /*
        I asked to ChatGPT:
        ask me 10 java questions for practise while loop, for loop,
        string manipulations and method call functions.
        It said quickly:
        Certainly, here are ten Java questions for practice that cover
        while loops, for loops, string manipulations, and method calls:
         */

        // Q4: Write a program that reads in a string and prints out the number of vowels in the string.

        Scanner scan = new Scanner(System.in);
        System.out.print("This program will find number of vowels on your text, so lets try..." +
                "\nPlease enter some text :  ");
        String text = scan.nextLine();

        System.out.println();
        System.out.println("========== RESULT ==========");
        System.out.println("You have " + totalVowel(text) + " vowels on your text.");


    }
    public static String totalVowel(String text){
        String text1 = text.toLowerCase();
        int sum = 0;

        for (int i = 0; i < text1.length(); i++) {

            if(text1.charAt(i) == 'a' || text1.charAt(i) == 'e' || text1.charAt(i) == 'i' ||
                    text1.charAt(i) == 'o' || text1.charAt(i) == 'u'){
                sum++;
            }
        }
        return String.valueOf(sum);
    }

}
