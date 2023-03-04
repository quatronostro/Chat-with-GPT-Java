package Q3_ChatwithGPT;

import java.util.Arrays;
import java.util.Scanner;

public class P17_createArrayProductAllNum {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        ask me 5 while loop, 5 do while loop, 10 method overloading, 10 for loop question,
        5 basic array question in Java language,
        and ask this questions in a mix, also these will be different from previous questions
        It said quickly:
        Certainly! Here are some mixed Java questions:
         */

        // Q17: Write a method that takes in an array of integers and returns the product of all the numbers in the array.

        int[] arr = createArray();

        System.out.println();
        System.out.println("========== RESULT ==========");
        System.out.println("This is your array : " + Arrays.toString(arr));
        System.out.println();
        System.out.println("This is the product of all numbers in the array is : " + (productOfAllNumbers(arr)));
    }
    public static int[] createArray(){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[0];
        int number = 1;

        while (number != 0) {
            System.out.println("Please create your array with adding number back to back. " +
                    "\nTo exit, press 0 (zero)");
            number = scan.nextInt();

            if (number != 0){
                arr = P15_replaceNegatives0.addingElementstoArray(arr, number);
            }
        }
        return arr;
    }

    public static int productOfAllNumbers(int[] arr){

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result += arr[i] * i;
        }

        return result;
    }
}
