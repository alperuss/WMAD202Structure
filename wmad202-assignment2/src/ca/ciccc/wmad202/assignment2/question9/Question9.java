package ca.ciccc.wmad202.assignment2.question9;

import java.util.Scanner;

public class Question9 {
    public void checkDigit(){
        System.out.println("Please enter a name: ");
        Scanner input = new Scanner(System.in);
        String input2 = input.nextLine();
        boolean result= input2.matches("[a-zA-Z]+");
        if(result) {
            System.out.println(input2.toUpperCase());

        }
        else{
            return;
        }
    }
}
