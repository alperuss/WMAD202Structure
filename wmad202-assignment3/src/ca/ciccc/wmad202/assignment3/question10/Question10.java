package ca.ciccc.wmad202.assignment3.question10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Question10 {
    public static void main(){
        String factor1 = factor();
        String factor2 = factor();
        String factor3 = factor();
        String factor4 = factor();
        String factor1_2 = factor1 +" + "+ factor2;
        String factor3_4 = factor3 +" + "+ factor4;
        //question1(factor1,factor2);
        //question2(factor1_2,factor3_4);
        //question3(factor1_2);

    }
    public static void question1(String factor1,String factor2){

        System.out.println(checkSingleFactorEquality(factor1,factor2));

    }
    public static boolean question2(String factor1,String factor2){


        if((!checkSingleFactorEquality(factor1,factor2))){
            System.out.println(factor1 + " are not same with " + factor2);
            return false;
        }
        else{
            System.out.println(factor1 + " are same with " + factor2);
            return true;
        }

    }
    public static void question3(String factor){

        String[] arr = new String[2];
        String[] parts =factor.split("\\+");
        for (int i =0;i< parts.length;i++) {
            String[] partPart=parts[i].split("\\^");
            arr[i]= partPart[1];

        }
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println("Biggest exponent number is " + arr[0]);


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
