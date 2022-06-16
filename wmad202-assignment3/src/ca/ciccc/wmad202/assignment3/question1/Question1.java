package ca.ciccc.wmad202.assignment3.question1;

public class Question1 {
    public static boolean isPrime(int num){

        for (int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    }

