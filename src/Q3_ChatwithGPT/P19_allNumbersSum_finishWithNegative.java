package Q3_ChatwithGPT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P19_allNumbersSum_finishWithNegative {
    public static void main(String[] args) {

        /*
        I asked to ChatGPT:
        ask me 5 while loop, 5 do while loop, 10 method overloading, 10 for loop question,
        5 basic array question in Java language,
        and ask this questions in a mix, also these will be different from previous questions
        It said quickly:
        Certainly! Here are some mixed Java questions:
         */

        // Q19: Write a while loop that prompts the user to enter a series of numbers,
        // and prints out the sum of all the numbers entered when the user enters a negative number.
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a series of positive numbers, this program will sum of all the numbers." +
                "\nTo finish this program you have to enter a negative number...");
        int enteredNumber;

        List<Integer> numbersList = new ArrayList<>();
        boolean flag = false;

        while (!flag){
            System.out.println("Enter your numbers : ");
            enteredNumber = scan.nextInt();
            if (enteredNumber >= 0){
                numbersList.add(enteredNumber);
            } else {
                flag = true;
            }
        }

        int sum = 0;

        for (int each: numbersList
             ) {
            sum += each;
        }

        System.out.println();
        System.out.println("========== RESULT ==========");
        System.out.println("The sum of numbers you gave : " + sum);

    }
}
