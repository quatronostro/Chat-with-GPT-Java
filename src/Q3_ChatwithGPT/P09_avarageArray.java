package Q3_ChatwithGPT;

import java.util.Arrays;

public class P09_avarageArray {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        ask me 5 while loop, 5 do while loop, 10 method overloading, 10 for loop question,
        5 basic array question in Java language,
        and ask this questions in a mix, also these will be different from previous questions
        It said quickly:
        Certainly! Here are some mixed Java questions:
         */

        // Q9: Write a method that takes in an array of doubles and returns the average of all the numbers in the array.

        double[] numbers = { 1.0, 6.0, 13.0, 4.2, 5.9 };
        System.out.println(Arrays.toString(numbers));

        double average = calculateAverage(numbers);

        System.out.println();
        System.out.println("========== RESULT ==========");
        System.out.println("The average is: " + average);

    }
    public static double calculateAverage(double[] numbers) {
        if (numbers.length == 0) {
            return 0.0; // if array is empty, return 0
        }

        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }
}
