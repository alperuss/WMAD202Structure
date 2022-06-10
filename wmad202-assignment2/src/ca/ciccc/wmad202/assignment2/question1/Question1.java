package ca.ciccc.wmad202.assignment2.question1;

import java.util.Scanner;

public class Question1 {
    public void numbersBetween() {
        System.out.println("Please enter first number: ");
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();
        System.out.println("Please enter second number: ");
        int input2 = input.nextInt();

        if (input1 < input2) {
            for (int i = input1 + 1; i < input2; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.printf("%d is divisible by 3 and 5 ", i);
                    System.out.println();
                }


            }
            for (int i = input1; i < input2; i++) {
                if (i % 6 == 0 || i % 7 == 0) {
                    System.out.printf("%d is divisible by 6 or 7  ", i);
                    System.out.println();
                }

            }
            for (int i = input1; i <= input2; i++) {
                if (i % 3 != 0) {
                    System.out.printf("%d is not divisible by 3 ", i);
                    System.out.println();
                }

            }

        } else {
            for (int i = input2 + 1; i < input1; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.printf("%d is divisible by 3 and 5 ", i);
                    System.out.println();
                }

            }
            for (int i = input2; i < input1; i++) {
                if (i % 6 == 0 || i % 7 == 0) {
                    System.out.printf("%d is divisible by 6 or 7  ", i);
                    System.out.println();

                }
            }
            for (int i = input2; i <= input1; i++) {
                if (i % 3 != 0) {
                    System.out.printf("%d is not divisible by 3 ", i);
                    System.out.println();

                }
            }

        }
    }

}
