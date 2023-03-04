package Q3_ChatwithGPT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P13_fibonacciSequence {
    public static void main(String[] args) {
         /*
        I asked to ChatGPT:
        ask me 5 while loop, 5 do while loop, 10 method overloading, 10 for loop question,
        5 basic array question in Java language,
        and ask this questions in a mix, also these will be different from previous questions
        It said quickly:
        Certainly! Here are some mixed Java questions:
         */

        // Q13: Write a for loop that prints out the Fibonacci sequence up to the nth term (where n is a user input).

        Scanner scan = new Scanner(System.in);
        System.out.println("This program prints out the Fibonacci sequence up to the your input number." +
                "\nPlease enter a positive number : ");
        int number = scan.nextInt();

        List<Integer> fibonacciSequenceList = new ArrayList<>();
        
        if(number <= 0){
            System.out.println("You have to enter at least 1, please try with bigger number.");
        } else if (number == 1) {
            fibonacciSequenceList.add(0);
        } else if (number == 2) {
            fibonacciSequenceList.add(1);
            fibonacciSequenceList.add(1);
        } else {
            int firstNumber = 0;
            fibonacciSequenceList.add(firstNumber);
            int secondNumber = 1;
            fibonacciSequenceList.add(secondNumber);
            int newNumber = firstNumber + secondNumber;
            fibonacciSequenceList.add(newNumber);

            for (int i = 1; i <= number; i++) {
                firstNumber = secondNumber;
                secondNumber = newNumber;
                newNumber = firstNumber + secondNumber;
                fibonacciSequenceList.add(newNumber);
            }
        }

        System.out.println("Here your numbers : " + fibonacciSequenceList);
    }
}
