package ca.ciccc.wmad202.assignment2.question4;

import java.util.Scanner;

public class Question4 {
    public void sampleMethod(){
        Scanner input = new Scanner(System.in);
        int[] numbers = {};
        int n=0;


        System.out.println("Please enter number: ");
        String number = input.next();
        boolean flag=true;
        while(flag){
            for (int i = 0; i < number.length(); i++) {

                if ((Character.isLetter(number.charAt(i)) == true)) {
                    //max and min


                }

            }

            int number1 = Integer.parseInt(number);
            number1 = numbers[n];
            System.out.println("Please enter number: ");
            number = input.next();

        }


    }
}
