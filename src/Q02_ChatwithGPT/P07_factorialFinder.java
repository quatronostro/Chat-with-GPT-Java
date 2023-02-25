package Q02_ChatwithGPT;

import java.util.Scanner;

public class P07_factorialFinder {
    public static void main(String[] args) {
         /*
        I asked to ChatGPT:
        ask me 10 java questions for practise while loop, for loop,
        string manipulations and method call functions.
        It said quickly:
        Certainly, here are ten Java questions for practice that cover
        while loops, for loops, string manipulations, and method calls:
         */

        // Q7: Write a program that reads in an integer and prints out the factorial of that integer.

        Scanner scan = new Scanner(System.in);
        System.out.print("This program will find factorial that from you given number." +
                "\nPlease enter a number :  \n");
        int number = scan.nextInt();

        System.out.println();
        System.out.println("========== RESULT ==========");
        factorialFinder(number);

    }
    public static void factorialFinder(int x){
        long factorial = 1;
        for (int i = 1; i <= x ; i++) {
            factorial *= i;
        }
        System.out.println("Factorial Result is : " + factorial);
    }
}
