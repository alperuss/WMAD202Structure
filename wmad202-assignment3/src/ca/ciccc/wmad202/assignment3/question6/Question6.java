package ca.ciccc.wmad202.assignment3.question6;

import java.util.ArrayList;
import java.util.Scanner;

public class Question6 {
    public static void removeDuplicated() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int number = input.nextInt();
        while (number < 100) {      // Stops when write greater than 100 and makes list
            list.add(number);
            number = input.nextInt();
        }


        System.out.println(firstList(list));
    }
    public static ArrayList<Integer> firstList(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if ((list.get(j) == list.get(i)) && (i != j)) {
                    list.remove(j);
                }
            }
        }
        return list;
    }

}
