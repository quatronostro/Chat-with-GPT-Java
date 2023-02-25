package Q02_ChatwithGPT;

import java.util.Scanner;

public class P08_oddNumber1to15 {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        ask me 10 java questions for practise while loop, for loop,
        string manipulations and method call functions.
        It said quickly:
        Certainly, here are ten Java questions for practice that cover
        while loops, for loops, string manipulations, and method calls:
         */

        // Q8: Write a for loop that prints the odd numbers from 1 to 15

        Scanner scan = new Scanner(System.in);
        System.out.println("This program will prints the odd numbers from 1 to 15. ");

        System.out.println();
        System.out.println("========== RESULT ==========");
        for (int i = 1; i <= 15 ; i += 2) {
            System.out.print(i + " ");
        }
    }
}
