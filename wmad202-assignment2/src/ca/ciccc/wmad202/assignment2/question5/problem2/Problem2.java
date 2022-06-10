package ca.ciccc.wmad202.assignment2.question5.problem2;

import java.util.Scanner;

public class Problem2 {
    public void reverse(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = input.next();
        String word2= new StringBuilder(word).reverse().toString();

        System.out.println(word2);

        if(word.equals(word2)){
            System.out.println("Words are same");
        }
        else{
            System.out.println("Words are not same");
        }




    }
}
