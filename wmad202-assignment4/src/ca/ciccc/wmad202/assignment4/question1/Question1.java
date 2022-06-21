package ca.ciccc.wmad202.assignment4.question1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Question1 {

    public static void test(){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        HashMap<Integer,Integer> numbers= new HashMap<>();
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        while(number!=0){
            if(numbers.containsKey(number)){
                System.out.println("You've entered this number. ");
                System.out.println("Please enter a different number: ");
                number = input.nextInt();
            }
            else{
                numbers.put(number,1);
                System.out.println("Please enter a new number: ");
                number = input.nextInt();
            }
        }

        for(Integer i : numbers.keySet()){
            sum = sum + i;
        }
        System.out.println("Sum of numbers are " + sum);



    }
}
