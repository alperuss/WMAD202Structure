package ca.ciccc.wmad202.assignment2.question3;

import java.util.Scanner;

public class Question3 {
    public void toBinary(){
        System.out.println("Please enter number: ");
        Scanner decimal = new Scanner(System.in);
        int decimal1= decimal.nextInt();
        String bin = Integer.toBinaryString(decimal1);
        System.out.println(bin);
    }

}
