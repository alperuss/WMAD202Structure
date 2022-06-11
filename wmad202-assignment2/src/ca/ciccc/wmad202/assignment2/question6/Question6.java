package ca.ciccc.wmad202.assignment2.question6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question6 {
    public void statement(){
        boolean stopAsking = true;
        List<Character> numbers = new ArrayList<>();
        while (stopAsking) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a statement : ");
            String input = scanner.nextLine();

            for(int i=0;i<input.length();i++){
                if (!Character.isLetter(input.charAt(i))){
                    if((input.charAt(i) == '(') || (input.charAt(i) == ')') || (input.charAt(i) == '+') || (input.charAt(i) == '*') ||
                            (input.charAt(i) == '%') || (input.charAt(i) == '-')){
                        numbers.add(input.charAt(i));
                        stopAsking=true;
                    }
                    else {
                        stopAsking=false;
                    }
                }
                numbers.add(input.charAt(i));
            }

        }
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
