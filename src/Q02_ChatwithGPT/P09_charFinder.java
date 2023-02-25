package Q02_ChatwithGPT;

import java.util.Arrays;
import java.util.Scanner;

public class P09_charFinder {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        ask me 10 java questions for practise while loop, for loop,
        string manipulations and method call functions.
        It said quickly:
        Certainly, here are ten Java questions for practice that cover
        while loops, for loops, string manipulations, and method calls:
         */

        // Q9: Write a method that takes in a string and a character,
        // and returns the number of times the character appears in the string.

        Scanner scan = new Scanner(System.in);
        System.out.println("This program tells you how many times the character you've given is used in the text" +
                "\nPlease enter a text : ");
        String str = scan.nextLine();
        System.out.println("Please enter a character : ");
        char chr = scan.next().charAt(0);

        String sum = charFinder(chr, str);

        System.out.println(chr + " is " + sum + " times used in the text : " + str);

    }
    public static String charFinder(char a, String b){
        int sum = 0;
        for (int i = 0; i < b.length() ; i++) {
            if ((char) i == a){
                sum++;
            }
        }

       return String.valueOf(sum);
    }
}
