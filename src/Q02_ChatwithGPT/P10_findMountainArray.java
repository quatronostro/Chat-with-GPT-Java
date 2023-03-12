package Q02_ChatwithGPT;

import java.util.Arrays;
import java.util.Scanner;

public class P10_findMountainArray {
    public static void main(String[] args) {

        int[] arr = arrayCreationFromUser();
        System.out.println("YOUR ARRAY : " + Arrays.toString(arr));

        System.out.println("Is this array mountain? \n" + mountainArrayController(arr));

    }

    private static boolean mountainArrayController(int[] arr) {

        if (arr.length < 3){ return false; }

        int i = 0, j = arr.length -1, n =  arr.length -1;

        while (i + 1 < n && arr[i] < arr[i + 1]){
            i++;
        }

        while (j > 0 && arr[j] < arr[j - 1]) {
            j--;
        }

        return (i > 0 && i == j && j < n);
    }


    public static int[] arrayCreationFromUser() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your array's length : ");
        int arrLength = scan.nextInt();

        int[] arr = new int[arrLength];

        System.out.println("Please enter your elements of array : ");


        for (int i = 0; i < arr.length; i++) {
            int elements = scan.nextInt();
            arr[i] += elements;
        }

        return arr;
    }
}
