package ca.ciccc.wmad202.assignment3.question3;

import java.util.Scanner;

public class Question3 {

    public static void shape(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of rows:  ");
        int num = scanner.nextInt();
        System.out.println("Please enter a shape model:   ");
        String model= scanner.next();
        if(model.equals("shape1")){
            shape1(num);
        }
        else if (model.equals("shape2")){
            shape2(num);
        }
        else if (model.equals("shape3")){
            shape3(num);
        }
        else{
            System.out.println("You entered wrong shape.");
        }





    }
    private static void shape1(int number){
        for (int i = 0; i <= number - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= number - 1 - i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    private static void shape2(int number){
        for (int i = 0; i <= number - 1; i++) {
            for (int k = 0; k <= number - 1 - i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    private static void shape3(int number)
    {

        for (int i = 1; i <= number; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
    }
}
}
