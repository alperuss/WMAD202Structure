package ca.ciccc.wmad202.assignment3.question1;

import java.util.Scanner;

public class Question1 {
    public void calculate(){
        System.out.println("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.format("Your number is %d", number);
    }
}
