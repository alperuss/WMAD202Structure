package ca.ciccc.wmad202.assignment2.question10;

import java.util.Scanner;

public class Question10 {
    public void function(){


        for(int i=3;i<100;i++){
            if(Math.pow(2,i)<Math.pow(i,5)){
                System.out.println("Numbers are F1(x)<F2(x): "+i);
            }




        }

        System.out.println("====================================================");
        for(int i=3;i<100;i++){
            if(Math.pow(2,i)>=Math.pow(i,5)){
                System.out.println("Numbers are F1(x)>F2(x): "+i);
            }
        }

    }
}
