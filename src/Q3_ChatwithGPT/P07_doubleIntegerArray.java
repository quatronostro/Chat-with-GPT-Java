package Q3_ChatwithGPT;

import java.util.Arrays;
import java.util.Scanner;

public class P07_doubleIntegerArray {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        ask me 5 while loop, 5 do while loop, 10 method overloading, 10 for loop question,
        5 basic array question in Java language,
        and ask this questions in a mix, also these will be different from previous questions
        It said quickly:
        Certainly! Here are some mixed Java questions:
         */

        // Q7: Write a for loop that iterates over an array of integers and doubles each number.

        int[] arr = {3, 5, 24, 4, 1, 345, 2, 3, 7, 2, 9};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }

        System.out.println();
        System.out.println("========== RESULT ==========");
        for (int j : arr) {
            System.out.print(j + ", ");
        }

    }
}
