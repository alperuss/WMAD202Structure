package ca.ciccc.wmad202.assignment3.question2;

import ca.ciccc.wmad202.assignment3.question1.Question1;

public class Question2 {
    public static int nextPrime(int number) {
        number = number + 1;

        while (Question1.isPrime(number)) {
            return number;
        }


        return nextPrime(number);
    }
}

