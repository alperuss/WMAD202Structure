package ca.ciccc.wmad202.assignment3.question5;

import java.util.ArrayList;
import java.util.Scanner;

public class Question5 {
    public static void repeatedNumbers(){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int number = input.nextInt();
        while(number<100){
            list.add(number);
            number = input.nextInt();
        }


        for (int i = 0; i < list.size(); i++)
        {
            for (int j = i+1; j < list.size(); j++)
            {
                if ((list.get(j) == list.get(i)) && (i != j))
                {
                    System.out.println("Duplicate Element : "+list.get(j));
                }
            }
        }
    }
}
