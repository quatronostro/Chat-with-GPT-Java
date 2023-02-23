package Q01_ChatwithGPT;

import java.util.Scanner;

public class P09_ifElse_passwordControler {
    public static void main(String[] args) {

         /*
        I asked to ChatGPT:
        Ask me 10 java if else question for practise
        It said quickly:
        Certainly, here are ten Java if-else questions for practice:
         */

        // Q9: Write an if-else statement that checks
        // if a given string is a valid password according to certain criteria
        // (e.g. must contain at least one uppercase letter, one lowercase letter, and one digit).

        Scanner scan = new Scanner(System.in);
        String password = "";
        boolean flag = false;
        int flagCounter = 0;

        while (!flag) {
            System.out.print("Please enter a password :  ");
            password = scan.nextLine();

            if (flagCounter == 5) {
                if (!isUpper(password)) {
                    System.out.println("The password must contain at least one uppercase letter, " +
                            "\nPlease try again: ");
                } else {
                    flagCounter++;
                }
                if (!isLower(password)){
                    System.out.println("The password must contain at least one lowercase letter, " +
                            "\nPlease try again: ");
                } else {
                    flagCounter ++;
                }
                if (!isDigit(password)){
                    System.out.println("The password must contain at least one digit character, " +
                            "\nPlease try again: ");
                } else {
                    flagCounter ++;
                }
                if (password.contains(" ")) {
                    System.out.println("The password mustn't contain space character, " +
                            "\nPlease try again: ");
                } else {
                    flagCounter ++;
                }
                if (password.length() >= 6){
                    flagCounter ++;
                } else {
                    System.out.println("The password has to be at least 6 character, " +
                            "\nPlease try again: ");
                }
            } else {
                System.out.println("Your password is a valid password!");
                flag = true;
            }

        }

    }

    public static boolean isUpper(String str){
        char ch;
        boolean upper = false;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (Character.isUpperCase(ch)){
                upper = true;
            } else {
                upper = false;
            }
        }
        return isUpper(str);
    }

    public static boolean isLower(String str){
        char ch;
        boolean lower = false;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (Character.isLowerCase(ch)){
                lower = true;
            } else {
                lower = false;
            }
        }
        return isLower(str);
    }

    public static boolean isDigit(String str){
        char ch;
        boolean digit = false;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (Character.isDigit(ch)){
                digit = true;
            } else {
                digit = false;
            }
        }
        return isDigit(str);
    }
}
