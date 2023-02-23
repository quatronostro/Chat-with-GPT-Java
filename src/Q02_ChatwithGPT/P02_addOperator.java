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

        // Q2: Write a method that takes in two number and returns their sum.
        Scanner scan = new Scanner(System.in);

        System.out.print("This program will add two numbers you given, so lets try..." +
                "\nPlease enter first number :  ");
        String num1 = scan.next();
        System.out.println("Please enter second number you want to add :");
        String num2 = scan.next();
        
        boolean n1flag = false;
        boolean n2flag = false;
        char ch;

        for (int i = 0; i < num1.length(); i++) {
            ch = num1.charAt(0);
            if (Character.isDigit(ch)) {
                n1flag = true;
            } else {
                n1flag = false;
            }
        }

        for (int i = 0; i < num2.length(); i++) {
            ch = num2.charAt(0);
            if (Character.isDigit(ch)) {
                n2flag = true;
            } else {
                n2flag = false;
            }
        }


        if (n1flag && n2flag){

                boolean i1 = !(num1.contains("."));
                boolean i2 = !(num1.contains("."));

                boolean d1 = (num1.contains("."));
                boolean d2 = (num1.contains("."));

                if (i1 && i2) {
                    int number1 = Integer.parseInt(num1);
                    int number2 = Integer.parseInt(num2);
                    System.out.println();
                    System.out.println("========== RESULT ==========");
                    addOperator(number1, number2);

                } else if (d1 && d2) {
                    double number1 = Double.parseDouble(num1);
                    double number2 = Double.parseDouble(num2);
                    System.out.println();
                    System.out.println("========== RESULT ==========");
                    addOperator(number1, number2);

                }


        } else {
            System.out.println("You need to enter a numeric value for the program to run.");
        }

        
    }


    public static void addOperator(int x, int y){
        System.out.println("The sum of your two numbers : " + (x + y));
    }

    public static void addOperator(double x, int y){
        System.out.println("The sum of your two numbers : " + (x + y));
    }

    public static void addOperator(int x, double y){
        System.out.println("The sum of your two numbers : " + (x + y));
    }

    public static void addOperator(double x, double y){
        System.out.println("The sum of your two numbers : " + (x + y));
    }

}
