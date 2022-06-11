package ca.ciccc.wmad202.assignment2.question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question4 {
    public void sampleMethod(){
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Please enter number: ");
        String number = input.nextLine();
        boolean out=true;
        while(out){
            for(int i=0; i < number.length(); i++) {
                boolean flag = Character.isDigit(number.charAt(i));
                if(!flag){
                    int max = Collections.max(numbers);
                    int min = Collections.min(numbers);
                    int difference = max-min;
                    System.out.println("Numbers are " + numbers);
                    System.out.println("Maximum number is "+ max);
                    System.out.println("Minimum number is "+ min);
                    System.out.println("Differences between max and min is  "+ difference);
                    number="0";
                    out = false;

                }
            }

            numbers.add(Integer.parseInt(number));
            System.out.println("Please enter number: ");
            number = input.nextLine();

        }


    }
}
