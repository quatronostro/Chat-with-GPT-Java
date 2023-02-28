package Q3_ChatwithGPT;

import java.util.Scanner;

public class P05_sumEvenNumbersinArray {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        ask me 5 while loop, 5 do while loop, 10 method overloading, 10 for loop question,
        5 basic array question in Java language,
        and ask this questions in a mix, also these will be different from previous questions
        It said quickly:
        Certainly! Here are some mixed Java questions:
         */

        // Q4: Write a method that takes in an array of integers and
        // returns the sum of all the even numbers in the array.

        Scanner scan = new Scanner(System.in);
        System.out.println("This program returns the sum of all the even number in the array." +
                "\nLets make an array! First of all, enter the size of array : ");
        int arrSize = scan.nextInt();

        int[] arr = new int[arrSize];

        System.out.println("Please enter the elements of arrays : ");

        for (int i = 0; i < arrSize; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println();
        System.out.println("========== RESULT ==========");
        System.out.println("The sum of all the even numbers in the array : " + sumEvenNumbersinArray(arr));

    }
    public static int sumEvenNumbersinArray(int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                sum += arr[i];
            }
        }

        return sum;
    }
}
