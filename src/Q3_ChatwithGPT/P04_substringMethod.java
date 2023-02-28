package Q3_ChatwithGPT;

import java.util.Scanner;

public class P04_substringMethod {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        ask me 5 while loop, 5 do while loop, 10 method overloading, 10 for loop question,
        5 basic array question in Java language,
        and ask this questions in a mix, also these will be different from previous questions
        It said quickly:
        Certainly! Here are some mixed Java questions:
         */

        // Q4: Write a method that takes in a string and a substring,
        // and returns the number of times the substring appears in the string.

        Scanner scan = new Scanner(System.in);
        System.out.println("This program gives you number of times substring appears in the string" +
                "\nPlease enter some text : ");
        String str = scan.nextLine();
        System.out.println("Please enter what you find in that text : ");
        String findStr = scan.nextLine();

        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1){
            lastIndex = str.indexOf(findStr, lastIndex);

            if (lastIndex != -1){
                count++;
                lastIndex += findStr.length();
            }
        }

        System.out.println();
        System.out.println("========== RESULT ==========");
        System.out.println("The substring used " + count + " times in the string.");

    }
}
