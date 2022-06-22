package ca.ciccc.wmad202.assignment4.question4;

import java.util.ArrayList;
import java.util.HashMap;

public class Question4 {
    public static void test() {
        int[] array = {1, 1, 2, 2, 3, 3, 4,4,5, 6, 6, 7, 7, 8, 8, 9, 9};
        findSingle(array);

    }

    public static void findSingle(int[] list) {
        HashMap<Integer,Integer> numbers = new HashMap<>();

        for (Integer i : list) {
            if (numbers.containsKey(i)) {
                numbers.remove(i);
            } else {
                numbers.put(i,1);
            }
        }

        System.out.println(numbers.keySet());
    }

}
