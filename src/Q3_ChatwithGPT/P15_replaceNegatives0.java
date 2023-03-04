package Q3_ChatwithGPT;

import java.util.Arrays;
import java.util.Scanner;

public class P15_replaceNegatives0 {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        Ask me 10 java if else question for practise
        It said quickly:
        Certainly, here are ten Java if-else questions for practice:
         */

        // Q15: Write a for loop that iterates over an array of integers and replaces any negative numbers with 0
        Scanner scan = new Scanner(System.in);

        int number = 1;

        int[] arr = new int[0];

        while (number != 0) {
            System.out.println("Please create your array with adding number back to back. " +
                    "\nTo exit, press 0 (zero)");
            number = scan.nextInt();

            if (number != 0){
                arr = addingElementstoArray(arr, number);
            }
        }

        System.out.println();
        System.out.println("========== RESULT ==========");
        System.out.println("This is our array : " + Arrays.toString(arr));



        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }

        System.out.println();
        System.out.println("This is our array w.out negatives : " + Arrays.toString(arr));
    }

    public static int[] addingElementstoArray(int[] arr, int addNum){

        int[] yeniArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length ; i++) {
            yeniArr[i] = arr[i];
        }

        yeniArr[yeniArr.length -1 ] = addNum;

        return yeniArr;
    }
}
