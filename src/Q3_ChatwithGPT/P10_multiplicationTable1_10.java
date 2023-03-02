package Q3_ChatwithGPT;

public class P10_multiplicationTable1_10 {
    public static void main(String[] args) {

        /*
        I asked to ChatGPT:
        ask me 5 while loop, 5 do while loop, 10 method overloading, 10 for loop question,
        5 basic array question in Java language,
        and ask this questions in a mix, also these will be different from previous questions
        It said quickly:
        Certainly! Here are some mixed Java questions:
         */

        // Q10: Write a for loop that prints out the multiplication table for numbers 1-10.

        System.out.println("*** MULTIPLICATION TABLE 1 to 10 ***");

        int lineNumber = 10;

        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= 3 ; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println(" ");
        }
    }
}
