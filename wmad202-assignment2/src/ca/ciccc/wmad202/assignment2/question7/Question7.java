package ca.ciccc.wmad202.assignment2.question7;

import java.util.Scanner;

public class Question7 {
    public void areaOfCircle(){

        System.out.println("Please enter length of square: ");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        double length2=Math.sqrt(2*(length*length));

        double areaOfCircle= Math.PI* ((length2*length2)/4);
        System.out.println(areaOfCircle);


    }
}
