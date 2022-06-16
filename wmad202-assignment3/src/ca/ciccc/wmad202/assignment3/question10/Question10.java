package ca.ciccc.wmad202.assignment3.question10;

import java.util.Scanner;

public class Question10 {

    public static void question1(){
        String factor1 = factor();
        String factor2 = factor();
        System.out.println(checkSingleFactorEquality(factor1,factor2));



    }
    public static boolean checkSingleFactorEquality(String factor1,String factor2){
        if (factor1.equals(factor2)){
            return true;
        }
        else {
            return false;
        }
    }
    public static String factor(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a coefficient number: ");
        int coefficient= input.nextInt();
        System.out.println("Please enter a baseFactor letter: ");
        String baseFactor= input.next();
        System.out.println("Please enter a exponent number: ");
        int exponent = input.nextInt();
        String factor = (coefficient + "*" + baseFactor + "^" + exponent);
        return factor;

    }


}
