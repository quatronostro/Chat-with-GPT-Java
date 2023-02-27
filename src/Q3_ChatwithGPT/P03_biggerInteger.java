package Q3_ChatwithGPT;

import java.util.Scanner;

public class P03_biggerInteger {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        ask me 5 while loop, 5 do while loop, 10 method overloading, 10 for loop question,
        5 basic array question in Java language,
        and ask this questions in a mix, also these will be different from previous questions
        It said quickly:
        Certainly! Here are some mixed Java questions:
         */

        // Q3: Write a method that takes in two integers and returns the larger one.

        Scanner scan = new Scanner(System.in);
        System.out.println("This program tells the larger integer of the two integers yo give. ");
        //        "\nPlease enter two consecutive integer : ");
        int firsNum;
        int secondNum;
        boolean flag = false;

        while (!flag){
            System.out.println("Please enter two consecutive integer : ");
            firsNum = scan.nextInt();
            secondNum = scan.nextInt();
            if (!(firsNum >= 1) || !(firsNum <= 9) && !(secondNum >= 1) || !(secondNum <= 9)) {
                System.out.println("Integer must be between 0 to 9, please try again.");
                flag = false;
            } else {
                if (firsNum > secondNum) {
                    System.out.println();
                    System.out.println("========== RESULT ==========");
                    System.out.println(firsNum + " is bigger than " + secondNum);
                    flag = true;
                } else {
                    System.out.println();
                    System.out.println("========== RESULT ==========");
                    System.out.println(secondNum + " is bigger than " + firsNum);
                    flag = true;
                }
            }
        }
        //System.out.println("Integer must be between 0 to 9, please try again.");
    }
}
