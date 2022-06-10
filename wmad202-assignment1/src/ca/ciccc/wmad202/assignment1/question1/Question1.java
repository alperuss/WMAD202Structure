package ca.ciccc.wmad202.assignment1.question1;

import java.util.Scanner;

public class Question1 {
    public static final double PI = 3.14;

    public void circleArena(){
        System.out.format("Please enter :" );
        Scanner scanner = new Scanner(System.in);
        float radius = scanner.nextFloat();

        System.out.format("The radius is %f and the area is %f",radius,radius*radius*PI);
    }
}
