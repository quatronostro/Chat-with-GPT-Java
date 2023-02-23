package Q02_ChatwithGPT;

import Q01_ChatwithGPT.P09_ifElse_passwordControler;

import java.util.Scanner;

public class P02_addOperator {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        ask me 10 java questions for practise while loop, for loop,
        string manipulations and method call functions.
        It said quickly:
        Certainly, here are ten Java questions for practice that cover
        while loops, for loops, string manipulations, and method calls:
         */

        // Q2: Write a method that takes in two integers and returns their sum.
        Scanner scan = new Scanner(System.in);

        System.out.print("This program will add two numbers you given, so lets try..." +
                "\nPlease enter first number :  ");
        String num1 = scan.nextLine();
        System.out.println("Please enter second number you want to add :");
        String num2 = scan.nextLine();






        System.out.println();
        System.out.println("========== RESULT ==========");



    }


    public static void addOperator(int x, int y){
        System.out.println("The sum of your two numbers " + (x + y));
    }

}
