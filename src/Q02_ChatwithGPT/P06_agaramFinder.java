package Q02_ChatwithGPT;

import java.util.Arrays;
import java.util.Scanner;

public class P06_agaramFinder {
    public static void main(String[] args) {

         /*
        I asked to ChatGPT:
        ask me 10 java questions for practise while loop, for loop,
        string manipulations and method call functions.
        It said quickly:
        Certainly, here are ten Java questions for practice that cover
        while loops, for loops, string manipulations, and method calls:
         */

        // Q6: Write a program that reads in two strings and checks if they are anagrams of each other.

        Scanner scan = new Scanner(System.in);
        System.out.print("This program will reads in two strings and checks if they are anagrams of each other" +
                "\nPlease enter first text :  \n");
        String string1 = scan.nextLine();
        System.out.println("Please enter another text to be compared : ");
        String string2 = scan.nextLine();

        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        if (string1.equals(string2)){
            System.out.println();
            System.out.println("========== RESULT ==========");
            System.out.println("The texts you given \"" + string1 + "\" and \"" + string2 + "\" are exact same, not anagram.");

        } else if (string1.length() == string2.length()){

            char[] characters1 = string1.toCharArray();
            char[] characters2 = string2.toCharArray();

            Arrays.sort(characters1);
            Arrays.sort(characters2);

            boolean result = Arrays.equals(characters1, characters2);

            if (result){
                System.out.println();
                System.out.println("========== RESULT ==========");
                System.out.println("The texts you given \"" + string1 + "\" and \"" + string2 + "\" are anagram.");
            } else {
                System.out.println();
                System.out.println("========== RESULT ==========");
                System.out.println("The texts you given \"" + string1 + "\" and \"" + string2 + "\" are not anagram.");
            }

        } else {
            System.out.println();
            System.out.println("========== RESULT ==========");
            System.out.println("The texts you given \"" + string1 + "\" and \"" + string2 + "\" are not anagram.");
        }



    }


}
