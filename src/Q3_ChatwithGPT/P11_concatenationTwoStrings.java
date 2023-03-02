package Q3_ChatwithGPT;

import java.util.Scanner;

public class P11_concatenationTwoStrings {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        ask me 5 while loop, 5 do while loop, 10 method overloading, 10 for loop question,
        5 basic array question in Java language,
        and ask this questions in a mix, also these will be different from previous questions
        It said quickly:
        Certainly! Here are some mixed Java questions:
         */

        // Q11: Write a method that takes in two strings and returns a new string
        // that is the concatenation of the two strings.

        Scanner scan = new Scanner(System.in);
        System.out.println("This program takes two string from you and return a new string that concat version." +
                "\nEnter your first text : ");
        String firstStr = scan.nextLine();
        System.out.println("Enter your second text : ");
        String secondStr = scan.nextLine();

        System.out.println();
        System.out.println("========== RESULT ==========");
        concatStrings(firstStr, secondStr);

    }

    public static void concatStrings(String str1, String str2){
        String concatVersion = str1.concat(str2);
        System.out.println(concatVersion);
    }
}
